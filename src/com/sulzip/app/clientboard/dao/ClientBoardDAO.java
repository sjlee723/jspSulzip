package com.sulzip.app.clientboard.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.MyBatisConfig;
import com.sulzip.app.clientboard.dto.ClientBoardDTO;

public class ClientBoardDAO {
	public SqlSession sqlSession;
	
	public ClientBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void write(ClientBoardDTO boardDTO) {
		sqlSession.insert("clientBoard.write", boardDTO);
	}
	
	public List<ClientBoardDTO> selectAll(Map<String, Integer> map) {
		return sqlSession.selectList("clientBoard.selectAll", map);
	}

	public ClientBoardDTO selectDetail(ClientBoardDTO boardDTO) {
		return sqlSession.selectOne("clientBoard.selectDetail", boardDTO);
	}
	
	public int totalCount() {
		return sqlSession.selectOne("clientBoard.totalCount");
	}
	
	public void modify(ClientBoardDTO boardDTO) {
		sqlSession.update("clientBoard.modify", boardDTO);
	}
	
	public void delete(ClientBoardDTO boardDTO) {
		sqlSession.delete("clientBoard.delete", boardDTO);
	}
	
}
