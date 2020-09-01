package com.yg.web.board.service;

import java.util.List;

import com.yg.common.Pagination;
import com.yg.common.Search;
import com.yg.web.board.model.BoardDTO;

public interface BoardService {
	
	public List<BoardDTO> getBoardList(Search search) throws Exception;
	
	public void insertBoard(BoardDTO boardDTO) throws Exception;
	
	public BoardDTO getBoardContent(int bid) throws Exception;
	
	public void updateBoard(BoardDTO boardDTO) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;
	
	public int getBoardListCnt(Search search) throws Exception;
	
}
