package com.test.mapper;

import java.util.List;

import com.test.dto.memberDto;


public interface Mapper {
	public memberDto InsertJoin(memberDto dto);
	
	public List<memberDto> AllSelect();
}
