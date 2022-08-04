package com.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "I cn see this on scree!!";
	}

}
