package com.sulzip.app.clientboard.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class ClientBoardDAO {
	public SqlSession sqlsession;
	
	public ClientBoardDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
