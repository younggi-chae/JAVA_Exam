package com.yg.web.board.dao;

import java.util.List;

import com.yg.common.Pagination;
import com.yg.common.Search;
import com.yg.web.board.model.BoardDTO;

public interface BoardDAO {
	 
	public List<BoardDTO> getBoardList(Search search) throws Exception;

	public BoardDTO getBoardContent(int bid) throws Exception;
	
	public int insertBoard(BoardDTO boardDTO) throws Exception;
	
	public int updateBoard(BoardDTO boardDTO) throws Exception;
	
	public int deleteBoard(int bid) throws Exception;
	
	//조회수
	public int updateViewCnt(int bid) throws Exception;
	
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;

}
