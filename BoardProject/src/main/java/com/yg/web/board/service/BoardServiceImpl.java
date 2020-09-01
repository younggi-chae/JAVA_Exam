package com.yg.web.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yg.common.Pagination;
import com.yg.common.Search;
import com.yg.web.board.dao.BoardDAO;
import com.yg.web.board.model.BoardDTO;


@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Transactional(readOnly = true)
	@Override
	public List<BoardDTO> getBoardList(Search search) throws Exception {
		return boardDAO.getBoardList(search);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void insertBoard(BoardDTO boardDTO) throws Exception {		
		boardDAO.insertBoard(boardDTO);
	}	
	
	@Transactional
	@Override
	public BoardDTO getBoardContent(int bid) throws Exception {		
		boardDAO.updateViewCnt(bid);
		return boardDAO.getBoardContent(bid);	
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void updateBoard(BoardDTO boardDTO) throws Exception {
		boardDAO.updateBoard(boardDTO);		
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void deleteBoard(int bid) throws Exception {
		boardDAO.deleteBoard(bid);		
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		return boardDAO.getBoardListCnt(search);
	}	
}
