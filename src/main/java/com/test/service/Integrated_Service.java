package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.dto.memberDto;

@Service
public interface Integrated_Service {

//	��Ʈ�ѷ����� ��û���� ���� ���ռ��񽺿� ���Լ��� ���� ��� �ȴ�
	public int InsertJoin(memberDto dto);

//	Select-All
	public List<memberDto> AllSelect();
}
