package com.sulzip.app.product.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.product.dto.ProductDTO;

public class ProductDAO {
	public SqlSession sqlsession;
	
	public ProductDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public ProductDTO alcohol (int productNumber){
		return sqlsession.selectOne("product.alcohol", productNumber);
	}
	
	public ProductDTO ingredients(int productNumber){
		return sqlsession.selectOne("product.ingredients", productNumber);
	}
	
	public ProductDTO supplies(int productNumber){
		return sqlsession.selectOne("product.supplies", productNumber);
	}
}
