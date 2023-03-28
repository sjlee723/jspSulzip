package com.sulzip.app.product.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class ProductDAO {
	public SqlSession sqlsession;
	
	public ProductDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
