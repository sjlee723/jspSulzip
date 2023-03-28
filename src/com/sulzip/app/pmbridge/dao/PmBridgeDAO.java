package com.sulzip.app.pmbridge.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PmBridgeDAO {
	public SqlSession sqlSession;
	
	public PmBridgeDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
