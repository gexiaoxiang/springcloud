package com.xxx.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

	@Bean
	public RestTemplate getreRestTemplate() {
		return new RestTemplate();
	}
}
