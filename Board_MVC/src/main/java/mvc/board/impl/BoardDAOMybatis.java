package mvc.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.board.BoardDTO;
import mvc.board.ReplyDTO;
import mvc.common.Search;

@Repository
public class BoardDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardDTO dto) {
		System.out.println("===> Mybatis로 insertBoard() 기능 처리");
		mybatis.insert("BoardDAO.insertBoard", dto);
	}
	
	public void updateBoard(BoardDTO dto) {
		System.out.println("===> Mybatis로 updateBoard() 기능 처리");
		mybatis.update("BoardDAO.updateBoard", dto);
	}
	
	public void deleteBoard(BoardDTO dto) {
		System.out.println("===> Mybatis로 deleteBoard() 기능 처리"); 
		mybatis.delete("BoardDAO.deleteBoard", dto);
	}
	
	public BoardDTO getBoard(BoardDTO dto) {
		System.out.println("===> Mybatis로 getBoard() 기능 처리");
		return (BoardDTO) mybatis.selectOne("BoardDAO.getBoard", dto);
	}
	
	public List<BoardDTO> getBoardList(Search search) {
		System.out.println("===> Mybatis로 getBoardList() 기능 처리");
		return mybatis.selectList("BoardDAO.getBoardList", search);
	}
	
	public void updateCnt(BoardDTO dto) {
		mybatis.update("BoardDAO.updateCnt", dto);				
	}
	
	public int getBoardListCnt(Search search) {
		return mybatis.selectOne("BoardDAO.getBoardListCnt", search);
	}		
}
