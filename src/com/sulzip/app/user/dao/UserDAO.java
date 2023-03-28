package com.sulzip.app.user.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class UserDAO {
	public SqlSession sqlsession;
	
	public UserDAO() {
		MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
