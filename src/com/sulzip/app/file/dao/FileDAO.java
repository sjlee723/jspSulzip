package com.sulzip.app.file.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class FileDAO {
	public SqlSession sqlsession;
	
	public FileDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
