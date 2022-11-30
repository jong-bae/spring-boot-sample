package com.sample.web;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleprojectApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SampleprojectApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
//		SpringApplication.run(Test2Application.class, args);
		
	}

}
