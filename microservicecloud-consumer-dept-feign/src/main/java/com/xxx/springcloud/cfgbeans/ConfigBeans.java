package com.xxx.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBeans {

	@Bean
	@LoadBalanced //springcloud ribbon实现负载均衡
	public RestTemplate getreRestTemplate() {
		return new RestTemplate();
	}
	@Bean
	public IRule myRule() {
		//用随机算法代替轮询
//		return new RandomRule();
		return new RetryRule();
	}
}
