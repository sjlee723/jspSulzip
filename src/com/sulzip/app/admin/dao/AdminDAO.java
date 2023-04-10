package com.sulzip.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.product.vo.ProductVO;

public class AdminDAO {
	public SqlSession sqlsession;
	
	public AdminDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public int sulkit() {
		return sqlsession.selectOne("admin.sulkit");
	}
	
	public int product(int categoryNumber) {
		return sqlsession.selectOne("admin.product", categoryNumber);
	}
	
	public List<ProductVO> sulkitList(){
		return sqlsession.selectList("admin.sulkitList");
	}
	
	public List<ProductVO> productList(){
		return sqlsession.selectList("admin.productList");
	}
	
	public ProductVO searchName(ProductVO productVO) {
		return sqlsession.selectOne("admin.searchName", productVO);
	}
	
}













