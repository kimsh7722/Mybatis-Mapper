package com.test.repository;

import java.util.List;

import com.test.dto.memberDto;

public interface All_Repository {
//	Service���� ���� �Ѱܹ޾� ���� ���Լ��� ����ȴ�
	public int InsertJoin(memberDto dto);
	
//	Select-All
	public List<memberDto> AllSelect();
}
