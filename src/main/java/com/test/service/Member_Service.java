package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dto.memberDto;
import com.test.repository.All_Repository;
//import com.test.repository.All_Repository;
import com.test.repository.Member_Repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@RequiredArgsConstructor
public class Member_Service implements Integrated_Service{
	
	@Autowired
	All_Repository join;
//	private final Member_Repository memRepository;
	
//	2. 이텔리제이 -> Eclipse
//	public int InsertJoin(memberDto dto) {
//				return memRepository.InsertJoin(dto); }

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int InsertJoin(memberDto dto) {
		log.info("Controller -> Service 도착한 값 : "+dto);
		return join.InsertJoin(dto);
	}

	@Override
	public List<memberDto> AllSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
