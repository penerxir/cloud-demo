package com.wangpx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * Student应用注册中心
 * @author Administrator
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class StudentRegistryApp {
	
	public static void main(String[] args) {
		SpringApplication.run(StudentRegistryApp.class, args);
	}
}
