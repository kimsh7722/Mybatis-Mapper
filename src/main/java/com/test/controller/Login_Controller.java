package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member")
public class Login_Controller {
	
	@GetMapping("/login")
	public String loginGet() {
	log.info("Login Page �̵�");
			
	return "/login/login";
	}
}
