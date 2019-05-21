package com.xxx.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBeans {

	@Bean
	@LoadBalanced //springcloud ribbon实现负载均衡
	public RestTemplate getreRestTemplate() {
		return new RestTemplate();
	}
}
