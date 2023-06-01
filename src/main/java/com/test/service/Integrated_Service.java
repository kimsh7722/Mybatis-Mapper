package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.dto.memberDto;

@Service
public interface Integrated_Service {

//	컨트롤러에서 요청받은 값을 통합서비스에 이함수로 값을 담게 된다
	public int InsertJoin(memberDto dto);

//	Select-All
	public List<memberDto> AllSelect();
}
