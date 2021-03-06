package com.yg.web.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yg.common.Search;
import com.yg.web.board.model.BoardDTO;
import com.yg.web.board.service.BoardService;


@Controller
@RequestMapping(value = "/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "/getBoardList", method= RequestMethod.GET)
	public String getBoardList(Model model
			,@RequestParam(required=false, defaultValue="1") int page
	        ,@RequestParam(required=false, defaultValue="1") int range
	        ,@RequestParam(required=false, defaultValue="TITLE") String searchType
	        ,@RequestParam(required=false) String keyword
	        ,@ModelAttribute("search") Search search) throws Exception {		
		
		//검색
		search.setSearchType(searchType);
		search.setKeyword(keyword);
		
		//전체 게시글 수
		int listCnt = boardService.getBoardListCnt(search);
		//검색
		search.pageInfo(page, range, listCnt);	
		
		//모델 정보 저장			
		model.addAttribute("pagination", search); //페이징
		model.addAttribute("boardList", boardService.getBoardList(search));
		return "board/index";
	}
	
	@RequestMapping("/boardForm")
	public String boardForm(@ModelAttribute("boardDTO") BoardDTO boardDTO, Model model) {
		return "board/boardForm";
	}
	
	@RequestMapping(value = "/saveBoard", method = RequestMethod.POST)
	public String saveBoard(@ModelAttribute("boardDTO") BoardDTO boardDTO
						  , @RequestParam("mode") String mode
					      , RedirectAttributes rttr) throws Exception {
		
		if(mode.equals("edit")) {
			boardService.updateBoard(boardDTO);
		} else
			boardService.insertBoard(boardDTO);		
		
		return "redirect:/board/getBoardList";
	}
	
	@RequestMapping(value = "/getBoardContent", method = RequestMethod.GET)
	public String getBoardContent(Model model, @RequestParam("bid") int bid) throws Exception {
		model.addAttribute("boardContent", boardService.getBoardContent(bid));
		return "board/boardContent";
	}
	
	@RequestMapping(value = "/editForm", method = RequestMethod.GET)
	public String editForm(@RequestParam("bid") int bid
				, @RequestParam("mode") String mode, Model model) throws Exception {
		model.addAttribute("boardContent", boardService.getBoardContent(bid));
		model.addAttribute("mode", mode);
		model.addAttribute("boardDTO", new BoardDTO());
		return "board/boardForm";		
	}
	
	@RequestMapping(value = "/deleteBoard", method = RequestMethod.GET)
	public String deleteBoard(RedirectAttributes rttr, @RequestParam("bid") int bid) throws Exception {
		boardService.deleteBoard(bid);
		return "redirect:/board/getBoardList";
	}	
}
