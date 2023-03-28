package com.sulzip.app.order.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;

public class OrderDAO {
	public SqlSession sqlsession;
	
	public OrderDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}
