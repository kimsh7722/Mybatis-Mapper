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
// ┌가상공간에 주가될 메인으로 경로 지정되고
@RequestMapping("/member")
@RequiredArgsConstructor
//	└final이 붙거나 NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
public class Member_Controller {
	
//	private final Member_Service service;
//	RequriredArgsConstructor 안해주면 값전달이 이루어 지지안음
	private final Integrated_Service service;
	
//	메인으로 지정된 값 안에 새로운 경로를 만든다
//	URL 주소값이 /member/save 형태로 추가한다
	@GetMapping("/save")
	public String saveGet() {
		log.info("Save Page 이동");
		
/*		┌가고자하는 위치로 이동 예) save->최상위 경로, /member/->해당폴더 가리킬때 사용
 * 		redirect:?(접속할 URL경로)->현재URL 초기화시키고 새로운 URL경로로 재접속한다  */
		return "/member/save";
	}
	
	@PostMapping("/save")
	public String savePost(@ModelAttribute memberDto dto) {
								/*	 └ 사용자로부터 받아온 값을 오브젝트 형식으로 바꿔준다
 							예) Front쪽 필드의 name의 값(param)을 Back쪽 Java의 객체의 값과 일치되도록 하는 것 */
		
		log.info("Save Page의 값을 추가합니다"+dto);
//		1. 이텔리제이 -> Eclipse
//		int saveResult = service.save(dto);
//		log.info("값전달? "+saveResult);
//		if(saveResult > 0) {
//			log.info("회원가입이 성공하였습니다.");
//			return "login";
//		}else {
//			log.info("필수항목을 적지 못하였습니다.");
//			return "save";
//		}
		
		int saveResult = service.InsertJoin(dto);
		log.info("서비스로 값 전달=>"+saveResult);
		if(saveResult > 0) 
			log.info("서비스로 값 전달 성공=>"+saveResult);			
			return "/login/login";
		 
		// 중복 값이 존재한다면 돌아가라
//		else {
//			log.info("서비스로 값 전달 실패=>"+saveResult);			
//			return "redirect:/sava";
//		}
	}
	
}
