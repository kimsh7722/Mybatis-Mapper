package Mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class Mybatis_Test {
	@Autowired
	SqlSession session;
	
	@Test
	public void func3() {
//		log.info("��� : "+mapper.InsertJoin("kim","woo","kim1","30","0102222"));
		log.info("SqlSession �۵�? "+session);
	}
}
