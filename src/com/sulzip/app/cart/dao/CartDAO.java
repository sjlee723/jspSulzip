package com.sulzip.app.cart.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class CartDAO {
	public SqlSession sqlsession;
	
	public CartDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
}
