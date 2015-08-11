package org.doxer.app.db.dbflute.exbhv;

import static com.github.hatimiti.doxer.common.util._Obj.*;
import static org.doxer.app.db.DBMetaManager.*;
import static org.doxer.xbase.support.SortOrder.*;

import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.result.PagingResultBean;
import org.doxer.app.base.type.form.sample.ad.master.cmkaisha.CmKaishaId;
import org.doxer.app.db.dbflute.bsbhv.BsCmKaishaBhv;
import org.doxer.app.db.dbflute.cbean.CmKaishaCB;
import org.doxer.app.db.dbflute.exentity.CmKaisha;
import org.doxer.app.sample.ad.master.cmkaisha.CmKaishaListForm;
import org.doxer.xbase.support.TableHeaderSortableBhv;

/**
 * The behavior of CM_KAISHA.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
@org.springframework.stereotype.Component("cmKaishaBhv")
public class CmKaishaBhv extends BsCmKaishaBhv
		implements TableHeaderSortableBhv<CmKaishaCB> {

	public CmKaisha selectByPk4Update(CmKaishaId cmKaishaId) {
//		cb.lockForUpdateWait(LOCK_WAIT_TIME);
		return selectEntity(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId.getValL());
		}).get();
	}

	public PagingResultBean<CmKaisha> selectPageForMaster(
			final CmKaishaListForm form) {

		PagingResultBean<CmKaisha> userPage = selectPage(cb -> {
			cb.ignoreNullOrEmptyQuery();
			cb.query().setCmKaishaId_Equal(form.getCmKaishaId().getValL());
			cb.query().setKaishaMei_LikeSearch(
					form.getKaishaMei().getVal(), op -> op.likePrefix());
			cb.paging(form.getPageSize(), form.getPageNumber());
			setOrder(cb, form.getSortColName(), form.getSortOrder());
		});
		return userPage;
	}

	public CmKaisha selectByPkWithRel(CmKaishaId cmKaishaId) {

		CmKaisha cmKaisha = selectEntity(cb -> {
			cb.query().setCmKaishaId_Equal(cmKaishaId.getValL());
		}).get();

		loadCmKishTesuryo(cmKaisha, cb -> {
			cb.query().addOrderBy_TekiyoKikanFromDt_Asc();
		});
		loadCmKishRenrakusaki(cmKaisha, cb -> {
			cb.query().addOrderBy_CmKishRenrakusakiId_Asc();
		});

		return cmKaisha;
	}

	@Override
	public ConditionQuery setOrder(CmKaishaCB cb, String sortColName, String sort) {
		return
			eq(CM_KAISHA$CM_KAISHA_ID, sortColName) ? isAsc(sort)
					? cb.query().addOrderBy_CmKaishaId_Asc() : cb.query().addOrderBy_CmKaishaId_Desc() :
			eq(CM_KAISHA$KAISHA_MEI, sortColName) ? isAsc(sort)
					? cb.query().addOrderBy_KaishaMei_Asc() : cb.query().addOrderBy_KaishaMei_Desc() :
			eq(CM_KAISHA$KAISHA_MEI_EN, sortColName) ? isAsc(sort)
					? cb.query().addOrderBy_KaishaMeiEn_Asc() : cb.query().addOrderBy_KaishaMeiEn_Desc() :
			null;
	}

}
