//package com.yg.web;
//
//import java.util.List;
//
//import javax.inject.Inject;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.yg.web.board.dao.BoardDAO;
//import com.yg.web.board.model.BoardDTO;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//		"classpath:spring/root-context.xml",
//		"classpath:spring/dataSource-context.xml"
//		})
//
//public class BoardDAOTest {
//
//	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
//
//	@Inject
//	private BoardDAO boardDAO;	
//
////	@Test @Ignore
////	public void testGetBoardList() throws Exception {
////		List<BoardDTO> boardList = boardDAO.getBoardList(search);
////		logger.info("\n Board List \n ");
////
////		if(boardList.size() > 0) {
////			for(BoardDTO list : boardList) {
////				logger.info(list.title);
////			}
////
////		} else {
////			logger.info("데이터가 없습니다.");
////
////		}
////	}
//	
//
//	@Test 
//	public void testGetBoardContent() throws Exception {
//		BoardDTO boardDTO = boardDAO.getBoardContent(1);
//		logger.info("\n Board List \n ");
//		if(boardDTO != null) {
//			logger.info("글번호 : " + boardDTO.getBid() );
//			logger.info("글제목 : " + boardDTO.getTitle() );
//			logger.info("글내용 : " + boardDTO.getContent() );
//			logger.info("글태그 : " + boardDTO.getTag() );
//			logger.info("조회수 : " + boardDTO.getView_cnt() );
//			logger.info("작성자 : " + boardDTO.getReg_id() );
//			logger.info("작성일 : " + boardDTO.getReg_dt() );
//			logger.info("수정일 : " + boardDTO.getEdit_dt() );
//
//		} else {
//			logger.info("데이터가 없습니다.");
//
//		}
//	}
//
//	@Test  @Ignore 
//	public void testInsertBoard() throws Exception {
//		BoardDTO boardDTO = new BoardDTO();
//		boardDTO.setCate_cd("1");
//		boardDTO.setTag("1");
//		boardDTO.setReg_id("1");	
//		
//		for( int i = 1; i < 1234 ; i++) {
//		    boardDTO.setTitle(i + " 번째 게시물 입니다.");
//		    boardDTO.setContent(i + " 번째 게시물 입니다.");
//
//		int result = boardDAO.insertBoard(boardDTO);
//		logger.info("\n Insert Board Result " +result);		
//		if(result == 1) {
//			logger.info("\n 게시물 등록 성공 ");
//		} else {
//			logger.info("\n 게시물 등록 실패");
//		}
//		}
//	}	
//
//	@Test @Ignore 
//	public void testUpdateBoard() throws Exception {
//		BoardDTO boardVO = new BoardDTO();
//		boardVO.setBid(1);
//		boardVO.setCate_cd("1");
//		boardVO.setTitle("첫번째 게시물 입니다-수정 합니다.");
//		boardVO.setContent("첫번째 게시물입니다-수정합니다.");
//		boardVO.setTag("1-1");		
//
//		int result = boardDAO.updateBoard(boardVO);
//		logger.info("\n Update Board Result \n ");
//		if(result > 0) {
//			logger.info("\n 게시물 수정 성공 ");
//		} else {
//			logger.info("\n 게시물 수정 실패");
//		}
//	}
//
//	@Test   @Ignore
//	public void tesDeleteBoard() throws Exception {
//		int result = boardDAO.deleteBoard(1);
//		logger.info("\n Delete Board Result \n ");
//		if(result > 0) {
//			logger.info("\n 게시물 삭제 성공 ");
//		} else {
//			logger.info("\n 게시물 삭제 실패");
//		}
//	}
//
//	@Test @Ignore
//	public void testUpdateViewCnt() throws Exception {
//		int result = boardDAO.updateViewCnt(1);
//		logger.info("\n Update View Count Result \n ");
//		if(result > 0) {
//			logger.info("\n 게시물 조회수 업데이트 성공 ");
//		} else {
//			logger.info("\n 게시물 조회수 업데이트 실패");
//		}
//	}
//}
