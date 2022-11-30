package com.sample.web.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sample.web.common.mail.MailSenderService;

@Controller
public class SampleController {

	@Autowired private SampleService sampleService;
	@Autowired private MailSenderService mailSenderService;
	
	@GetMapping("/test")
	public String test(Model model) {
		//String getDate = testService.getToday()
		model.addAttribute("data", sampleService.getToday());
		return "sample/sample";
	}
	
	@GetMapping("/mailtest")
	public String mailtest(Model model) {
		String[] toUser = {"mandolle777@gmail.com"};
		mailSenderService.sendMail("TEST", "TEST CONTENTS", "jbpark@jsd1.co.kr", toUser);
		
		model.addAttribute("data", sampleService.getToday2());
		return "sample/sample2";
	}
}
