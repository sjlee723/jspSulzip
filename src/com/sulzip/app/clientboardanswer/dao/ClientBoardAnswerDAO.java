package com.sulzip.app.clientboardanswer.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class ClientBoardAnswerDAO {
	public SqlSession sqlsession;
	
	public ClientBoardAnswerDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
