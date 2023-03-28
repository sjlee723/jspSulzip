package com.sulzip.app.myrecipeboard.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class MyRecipeBoardDAO {
	public SqlSession sqlsession;
	
	public MyRecipeBoardDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
