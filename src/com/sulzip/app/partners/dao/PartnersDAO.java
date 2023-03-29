package com.sulzip.app.partners.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.partners.dto.PartnersDTO;

public class PartnersDAO {
	public SqlSession sqlSession;
	
	public PartnersDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void inquiry(PartnersDTO partnersDTO) {
		sqlSession.insert("partners.inquiry", partnersDTO);
	}
}
