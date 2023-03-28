package com.sulzip.app.psbridge.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PsBridgeDAO {
	public SqlSession sqlSession;
	
	public PsBridgeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}

}
