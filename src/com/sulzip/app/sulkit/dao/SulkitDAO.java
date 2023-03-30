package com.sulzip.app.sulkit.dao;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.product.dto.ProductDTO;
import com.sulzip.app.sulkit.dto.SulkitDTO;

public class SulkitDAO {
	public SqlSession sqlsession;
	
	public SulkitDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public SulkitDTO selectSulkit (int sulkitNumber){
		return sqlsession.selectOne("sulkit.selectSulkit", sulkitNumber);
	}
	
	public ProductDTO recipe(int productNumber) {
		return sqlsession.selectOne("sulkit.recipe", productNumber);
	}
}
