package com.sulzip.app.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.file.dto.FileDTO;

public class FileDAO {
	public SqlSession sqlSession;
	
	public FileDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void insert(FileDTO fileDTO) {
		sqlSession.insert("file.insert", fileDTO);
	}
	
	public List<FileDTO> select(int myRecipeNumber){
		return sqlSession.selectList("file.select", myRecipeNumber);
	}
	
	public void delete(int myRecipeNumber) {
		sqlSession.delete("file.delete", myRecipeNumber);
	}
}
