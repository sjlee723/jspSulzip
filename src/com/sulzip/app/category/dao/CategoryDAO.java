package com.sulzip.app.category.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class CategoryDAO {
	public SqlSession sqlsession;
	
	public CategoryDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
