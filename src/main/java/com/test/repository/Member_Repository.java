package com.test.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dto.memberDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Repository
//@RequiredArgsConstructor
public class Member_Repository implements All_Repository{
	
//	DB-session 요청
	@Autowired
	private SqlSession sql;
//	private final SqlSession sql;
	
//	패키지안의 경로
	private static String namespace="com.test.mapper.Mapper.";
	
//	이텔리제이 -> Eclipse
//	XML-namespace 경로 값을 담다	
//	public int InsertJoin(memberDto dto) {
//		log.info("Service -> Repository 전달 받은 값 : "+dto);
//		return sql.insert(namespace+"InsertJoin" , dto);
//	}

	@Override
	public int InsertJoin(memberDto dto) {
		log.info("현재 Repository에게 전달 받은 dto=> "+dto);
		return sql.insert(namespace+"InsertJoin",dto);
	}

	@Override
	public List<memberDto> AllSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
