package com.jpa.web.sample;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="API", description = "Sample API 입니다.")
@RestController
@RequestMapping("/api")
public class SampleController {

	@Autowired private SampleService sampleService;
	
	@PostMapping("/getUser/{age}")
	public List<User> getUser(@Parameter(description = "나이") @PathVariable("age") int age) {
		return sampleService.getUser(age);
	}
}
