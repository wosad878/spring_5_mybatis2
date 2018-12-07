package com.iu.s5;

import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ConnectionTest extends AbstractTestCase {
	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void test() throws Exception {
		assertNotNull(sqlSession);
	}

}
