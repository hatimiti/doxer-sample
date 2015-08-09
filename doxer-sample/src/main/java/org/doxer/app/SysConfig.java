package org.doxer.app;

import org.doxer.app.base.thymeleaf.util.JUtilityDialect;
import org.doxer.xbase.config.DoxSysConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;

@Configuration
public class SysConfig extends DoxSysConfig {

	@Bean
	@Override
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = super.templateEngine();
		templateEngine.addDialect(new JUtilityDialect());
		return templateEngine;
	}

}
