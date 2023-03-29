package com.sulzip.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class AdminDAO {
	public SqlSession sqlsession;
	
	public AdminDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
}
