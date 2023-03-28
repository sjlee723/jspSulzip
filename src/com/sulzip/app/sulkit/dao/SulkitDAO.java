package com.sulzip.app.sulkit.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class SulkitDAO {
	public SqlSession sqlsession;
	
	public SulkitDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
