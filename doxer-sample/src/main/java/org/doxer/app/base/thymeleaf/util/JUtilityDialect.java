package org.doxer.app.base.thymeleaf.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.doxer.xbase.thymeleaf.utility.SAUtility;
import org.thymeleaf.context.IProcessingContext;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionEnhancingDialect;

public class JUtilityDialect extends AbstractDialect implements IExpressionEnhancingDialect {

	@Override
	public String getPrefix() {
		return "ju";
	}

	private static final Map<String, Object> EXPRESSION_OBJECTS;
	static {
		Map<String, Object> objects = new HashMap<>();
		objects.put("j", new JUtility());
		objects.put("sa", new SAUtility());
		EXPRESSION_OBJECTS = Collections.unmodifiableMap(objects);
	}

	@Override
	public Map<String, Object> getAdditionalExpressionObjects(
			IProcessingContext processingContext) {
		return EXPRESSION_OBJECTS;
	}

}
