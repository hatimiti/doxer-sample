package org.doxer.app.sample.time.calc;

import static com.github.hatimiti.doxer.common.util._Num.*;
import static com.github.hatimiti.doxer.common.util._Str.*;
import static org.doxer.app.sample.time.calc.DateAndTimeAPICalcController.*;
import static org.doxer.xbase.controller.DoxController.DoxModelAndView.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Predicate;

import org.doxer.app.base.controller.BaseMasterController;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateDaysFromBirth;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateEndOfMonth;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateNextDayOfWeek;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateNextWeekday;
import org.doxer.app.sample.time.calc.DateAndTimeAPICalcForm.ValidateNowAfterN;
import org.doxer.xbase.aop.interceptor.supports.DoValidation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.hatimiti.doxer.common.annotation.Function;

/**
 * sample
 * @author hatimiti
 */
@Controller
@Function("T0101")
@RequestMapping(URI)
public class DateAndTimeAPICalcController extends BaseMasterController {

	public static final String URI = "/sample/timeapi/calc/";
	public static final String INDEX = URI + "index.html";

	@RequestMapping
	public DoxModelAndView index(DateAndTimeAPICalcForm form) {
		return view(URI, "index.html", form);
	}

	@DoValidation(v = { ValidateNowAfterN.class }, to = INDEX)
	@RequestMapping(params = "nowAfterN")
	public DoxModelAndView nowAfterN(DateAndTimeAPICalcForm form) {

		LocalDate now = LocalDate.now();
		LocalDate afterN = now.plusDays(Long.parseLong(form.val1));
		form.afterNDayFromNow = afterN.format(DateTimeFormatter.ofPattern("yyyy/MM/dd(E)"))
				+ (afterN.isLeapYear() ? " [閏年]" : "");

		return view(INDEX, form);
	}

	@DoValidation(v = { ValidateNextDayOfWeek.class }, to = INDEX)
	@RequestMapping(params = "nextDayOfWeek")
	public DoxModelAndView nextDayOfWeek(DateAndTimeAPICalcForm form) {

		DayOfWeek dow = DayOfWeek.of(asIntOrNull(form.val2));
		LocalDate next = LocalDate.now().with(TemporalAdjusters.next(dow));
		form.nextDayOfWeek = next.format(DateTimeFormatter.ofPattern("yyyy/MM/dd(E)"));

		return view(INDEX, form);
	}

	@DoValidation(v = { ValidateEndOfMonth.class }, to = INDEX)
	@RequestMapping(params = "endOfMonth")
	public DoxModelAndView endOfMonth(DateAndTimeAPICalcForm form) {

		YearMonth ym = YearMonth.of(asIntOrNull(form.val3), asIntOrNull(form.val4));
		form.endOfMonth = String.valueOf(ym.atEndOfMonth().getDayOfMonth());

		return view(INDEX, form);
	}

	@DoValidation(v = { ValidateDaysFromBirth.class }, to = INDEX)
	@RequestMapping(params = "daysFromBirth")
	public DoxModelAndView daysFromBirth(DateAndTimeAPICalcForm form) {

		LocalDate birth = LocalDate.parse(form.val5, DateTimeFormatter.ofPattern("yyyyMMdd"));
		LocalDate now = LocalDate.now();

		form.daysFromBirth = asStrOrEmpty(birth.until(now, ChronoUnit.DAYS));

		return view(INDEX, form);
	}

	@DoValidation(v = { ValidateNextWeekday.class }, to = INDEX)
	@RequestMapping(params = "nextWeekday")
	public DoxModelAndView nextWeekday(DateAndTimeAPICalcForm form) {
		LocalDate ymd = LocalDate.parse(form.val6, DateTimeFormatter.ofPattern("yyyyMMdd"));
		form.nextWeekday = ymd.with(next(w -> w.getDayOfWeek().getValue() < 6))
				.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)"));
		return view(INDEX, form);
	}

	private static TemporalAdjuster next(Predicate<LocalDate> pred) {
		return t -> {
			LocalDate dt = (LocalDate) t;
			do {
				dt = dt.plusDays(1);
			} while (!pred.test(dt));
			return dt;
		};
	}

}
