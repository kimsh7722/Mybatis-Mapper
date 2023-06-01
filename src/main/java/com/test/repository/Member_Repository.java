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
	
//	DB-session ��û
	@Autowired
	private SqlSession sql;
//	private final SqlSession sql;
	
//	��Ű������ ���
	private static String namespace="com.test.mapper.Mapper.";
	
//	���ڸ����� -> Eclipse
//	XML-namespace ��� ���� ���	
//	public int InsertJoin(memberDto dto) {
//		log.info("Service -> Repository ���� ���� �� : "+dto);
//		return sql.insert(namespace+"InsertJoin" , dto);
//	}

	@Override
	public int InsertJoin(memberDto dto) {
		log.info("���� Repository���� ���� ���� dto=> "+dto);
		return sql.insert(namespace+"InsertJoin",dto);
	}

	@Override
	public List<memberDto> AllSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
