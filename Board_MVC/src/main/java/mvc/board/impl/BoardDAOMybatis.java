package mvc.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.board.BoardDTO;
import mvc.common.Search;

@Repository
public class BoardDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardDTO dto) {		
		mybatis.insert("BoardDAO.insertBoard", dto);
	}
	
	public void updateBoard(BoardDTO dto) {		
		mybatis.update("BoardDAO.updateBoard", dto);
	}
	
	public void deleteBoard(BoardDTO dto) {		
		mybatis.delete("BoardDAO.deleteBoard", dto);
	}
	
	public BoardDTO getBoard(BoardDTO dto) {		
		return (BoardDTO) mybatis.selectOne("BoardDAO.getBoard", dto);
	}
	
	public List<BoardDTO> getBoardList(Search search) {		
		return mybatis.selectList("BoardDAO.getBoardList", search);
	}
	
	public void updateCnt(BoardDTO dto) {
		mybatis.update("BoardDAO.updateCnt", dto);				
	}
	
	public int getBoardListCnt(Search search) {
		return mybatis.selectOne("BoardDAO.getBoardListCnt", search);
	}		
}
