package com.fund.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping("/")
	public String home() {
		return "Das Boot, this is my first spring boot application";
	}
	
	
}
