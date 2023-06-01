package com.test.repository;

import java.util.List;

import com.test.dto.memberDto;

public interface All_Repository {
//	Service에서 값을 넘겨받아 현재 이함수에 저장된다
	public int InsertJoin(memberDto dto);
	
//	Select-All
	public List<memberDto> AllSelect();
}
