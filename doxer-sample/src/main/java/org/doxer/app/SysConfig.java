package org.doxer.app;

import org.doxer.app.base.thymeleaf.util.JUtilityDialect;
import org.doxer.xbase.config.DoxSysConfig;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;

@Configuration
@EnableCaching
public class SysConfig extends DoxSysConfig {

	@Bean
	@Override
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = super.templateEngine();
		templateEngine.addDialect(new JUtilityDialect());
		return templateEngine;
	}

	/**
	 * Cache Manual
	 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/cache.html
	 */
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager("sampleData");
	}

}
