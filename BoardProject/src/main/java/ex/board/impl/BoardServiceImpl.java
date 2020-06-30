package ex.board.impl;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.board.BoardService;
import ex.board.BoardVO;


@Service("boardService")
public class BoardServiceImpl implements BoardService {
          @Autowired
          private BoardDAOMybatis boardDAO;
         
       // 글 등록
      	public void insertBoard(BoardVO vo) {
//      		if(vo.getSeq() == 0) {
//      			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//      		}
      		boardDAO.insertBoard(vo);
      	}

      	// 글 수정
      	public void updateBoard(BoardVO vo) {
      		boardDAO.updateBoard(vo);
      	}

      	// 글 삭제
      	public void deleteBoard(BoardVO vo) {
      		boardDAO.deleteBoard(vo);
      	}

      	// 글 상세 조회
      	public BoardVO getBoard(BoardVO vo) {
      		return boardDAO.getBoard(vo);
      	}

      	// 글 목록 조회
      	public List<BoardVO> getBoardList(BoardVO vo){
      		return boardDAO.getBoardList(vo);
      	}
}
