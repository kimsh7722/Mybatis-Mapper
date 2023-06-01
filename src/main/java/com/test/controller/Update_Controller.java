package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/member")
public class Update_Controller {
	
	@GetMapping("/userUpdate")
	public String GetUser() {
		log.info("회원 정보 수정이동");
		return "/member-update/userUpdate";
	}
	
//	@PostMapping("/userUpdate")
//	public String userPost() {
//		log.info("회원 정보 수정추가 이동");
//		return "/update/userUpdate";
//	}
	
//	--------- 전체 정보 불러오기 All_Select 구간 ----------
	@GetMapping("/userSelect")
	public String SelectAll() {
		return "/member-update/userSelect";
	}
}
