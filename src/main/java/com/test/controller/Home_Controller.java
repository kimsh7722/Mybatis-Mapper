package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class Home_Controller {
	
	@RequestMapping("/")
	public String home(){
		log.info("기본 Index Page 입니다");
		return "index";
	}
	
	
}
