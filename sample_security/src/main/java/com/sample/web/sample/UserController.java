package com.sample.web.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

	@Autowired private UserService userService;
	
	
	@PostMapping("/sign")
	public String sign(@ModelAttribute UserDTO param) {
		userService.signUser(param);
		return "redirect:/";
	}
	
	@GetMapping("/login")
	public void login() {
		
	}

	@GetMapping("/home")
	public void home() {
		
	}
	
}
