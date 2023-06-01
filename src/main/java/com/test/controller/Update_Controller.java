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
		log.info("ȸ�� ���� �����̵�");
		return "/member-update/userUpdate";
	}
	
//	@PostMapping("/userUpdate")
//	public String userPost() {
//		log.info("ȸ�� ���� �����߰� �̵�");
//		return "/update/userUpdate";
//	}
	
//	--------- ��ü ���� �ҷ����� All_Select ���� ----------
	@GetMapping("/userSelect")
	public String SelectAll() {
		return "/member-update/userSelect";
	}
}
