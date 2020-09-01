package com.yg.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yg.common.Pagination;
import com.yg.common.Search;
import com.yg.web.board.model.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> getBoardList(Search search) throws Exception {		
		return sqlSession.selectList("com.yg.web.board.boardMapper.getBoardList", search);
	}

	@Override
	public BoardDTO getBoardContent(int bid) throws Exception {		
		return sqlSession.selectOne("com.yg.web.board.boardMapper.getBoardContent", bid);
	}

	@Override
	public int insertBoard(BoardDTO boardDTO) throws Exception {		
		return sqlSession.insert("com.yg.web.board.boardMapper.insertBoard", boardDTO);
	}

	@Override
	public int updateBoard(BoardDTO boardDTO) throws Exception {		
		return sqlSession.update("com.yg.web.board.boardMapper.updateBoard", boardDTO);
	}

	@Override
	public int deleteBoard(int bid) throws Exception {		
		return sqlSession.delete("com.yg.web.board.boardMapper.deleteBoard", bid);
	}

	@Override
	public int updateViewCnt(int bid) throws Exception {		
		return sqlSession.update("com.yg.web.board.boardMapper.updateViewCnt", bid);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return sqlSession.selectOne("com.yg.web.board.boardMapper.getBoardListCnt", search);
	}
	
}
