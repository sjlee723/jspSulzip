package com.sulzip.app.partners.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class PartnersDAO {
	public SqlSession sqlsession;
	
	public PartnersDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
