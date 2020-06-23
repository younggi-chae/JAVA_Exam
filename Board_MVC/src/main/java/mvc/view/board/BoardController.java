package mvc.view.board;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import mvc.board.BoardDTO;
import mvc.board.BoardService;


@Controller
@SessionAttributes("board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	// 글등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardDTO dto) throws IOException {
		
		MultipartFile uploadFile = dto.getUploadFile();
		if(!uploadFile.isEmpty()) {
			String fileName = uploadFile.getOriginalFilename();
			uploadFile.transferTo(new File("C:/" + fileName));
		}
		boardService.insertBoard(dto);
		return "getBoardList.do";
	}
 
	// 글수정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardDTO dto) {
		boardService.updateBoard(dto);
		return "getBoardList.do";
	}

	// 글삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardDTO dto) {

		System.out.println("글 삭제 처리");
		boardService.deleteBoard(dto);
		return "getBoardList.do";
	}

	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardDTO dto, Model model) {

		System.out.println("글 상세 조회 처리");
		boardService.updateCnt(dto);
		model.addAttribute("board", boardService.getBoard(dto));
		return "getBoard.jsp";
		
	}

	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardDTO dto, Model model) {
		
		//Null Check
		if(dto.getSearchCondition() == null) dto.setSearchCondition("TITLE");
		if(dto.getSearchKeyword() == null) dto.setSearchKeyword("");
		//모델 정보 저장
		model.addAttribute("boardList", boardService.getBoardList(dto));
		return "getBoardList.jsp";
	}
	
	//검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
}
