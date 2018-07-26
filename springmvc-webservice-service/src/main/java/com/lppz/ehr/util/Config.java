package com.lppz.ehr.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@Configuration
@PropertySource(value={"classpath:ehr-jdbc.properties"})
public class Config{

    @Value("${redis.ipport}")
    public String redisIpPort;

    @Value("${dingding.api.url}")
    public String dingdingApi;

    @Value("${job.sleep.times}")
    public Long sleepTimes;
    
    @Value("${job.sleep.jobTimes}")
    public Long jobTimes;


	@Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
       return new PropertySourcesPlaceholderConfigurer();
    }
	
}
