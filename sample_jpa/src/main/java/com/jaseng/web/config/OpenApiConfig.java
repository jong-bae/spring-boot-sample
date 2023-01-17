package com.jaseng.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI openAPI() {
		Info info = new Info()
				.title("Sample OpenAPI Docs")
				.version("1.0")
				.description("api docs");
		
		return new OpenAPI().components(new Components()).info(info);
	}
}
