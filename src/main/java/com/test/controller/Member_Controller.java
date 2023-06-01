package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dto.memberDto;
import com.test.service.Integrated_Service;
//import com.test.service.Integrated_Service;
import com.test.service.Member_Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
// ����������� �ְ��� �������� ��� �����ǰ�
@RequestMapping("/member")
@RequiredArgsConstructor
//	��final�� �ٰų� NotNull �� ���� �ʵ��� �����ڸ� �ڵ� �������ִ� �Һ� ������̼�
public class Member_Controller {
	
//	private final Member_Service service;
//	RequriredArgsConstructor �����ָ� �������� �̷�� ��������
	private final Integrated_Service service;
	
//	�������� ������ �� �ȿ� ���ο� ��θ� �����
//	URL �ּҰ��� /member/save ���·� �߰��Ѵ�
	@GetMapping("/save")
	public String saveGet() {
		log.info("Save Page �̵�");
		
/*		���������ϴ� ��ġ�� �̵� ��) save->�ֻ��� ���, /member/->�ش����� ����ų�� ���
 * 		redirect:?(������ URL���)->����URL �ʱ�ȭ��Ű�� ���ο� URL��η� �������Ѵ�  */
		return "/member/save";
	}
	
	@PostMapping("/save")
	public String savePost(@ModelAttribute memberDto dto) {
								/*	 �� ����ڷκ��� �޾ƿ� ���� ������Ʈ �������� �ٲ��ش�
 							��) Front�� �ʵ��� name�� ��(param)�� Back�� Java�� ��ü�� ���� ��ġ�ǵ��� �ϴ� �� */
		
		log.info("Save Page�� ���� �߰��մϴ�"+dto);
//		1. ���ڸ����� -> Eclipse
//		int saveResult = service.save(dto);
//		log.info("������? "+saveResult);
//		if(saveResult > 0) {
//			log.info("ȸ�������� �����Ͽ����ϴ�.");
//			return "login";
//		}else {
//			log.info("�ʼ��׸��� ���� ���Ͽ����ϴ�.");
//			return "save";
//		}
		
		int saveResult = service.InsertJoin(dto);
		log.info("���񽺷� �� ����=>"+saveResult);
		if(saveResult > 0) 
			log.info("���񽺷� �� ���� ����=>"+saveResult);			
			return "/login/login";
		 
		// �ߺ� ���� �����Ѵٸ� ���ư���
//		else {
//			log.info("���񽺷� �� ���� ����=>"+saveResult);			
//			return "redirect:/sava";
//		}
	}
	
}
