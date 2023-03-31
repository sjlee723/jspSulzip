package com.sulzip.app.sulkit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.sulkit.dto.SulkitDTO;
import com.sulzip.app.sulkit.vo.SulkitVO;

public class SulkitDAO {
	public SqlSession sqlsession;
	
	public SulkitDAO() {
		sqlsession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public SulkitDTO selectSulkit (int sulkitNumber){
		return sqlsession.selectOne("sulkit.selectSulkit", sulkitNumber);
	}
	
	public List<SulkitVO> recipe(int productNumber) {
		return sqlsession.selectList("sulkit.recipe", productNumber);
	}
}
