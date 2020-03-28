package com.wangpx.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供端
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.wangpx.provider.mapper"})
public class StudentProviderApp {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(StudentProviderApp.class, args);
	}
}
