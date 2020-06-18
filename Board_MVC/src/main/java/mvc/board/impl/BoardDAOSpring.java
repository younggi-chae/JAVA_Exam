package mvc.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mvc.board.BoardDTO;

@Repository
public class BoardDAOSpring {
	     
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARD_INSERT = "insert into board(SEQ, TITLE, WRITER, CONTENT) "
			+ "values((select ifnull(max(seq),0)+1 from board as a),?,?,?)";
	private final String BOARD_UPDATE = "update board set title=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from board where seq=?";
	private final String BOARD_GET    = "select * from board where seq=?";
	private final String BOARD_LIST_T = "select * from board where title like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C = "select * from board where content like '%'||?||'%' order by seq desc";
	 
	//글등록
	public void insertBoard(BoardDTO dto) {
		System.out.println("===> JDBC로 insertBoard() 기능 처리");
		jdbcTemplate.update(BOARD_INSERT, dto.getTitle(), dto.getWriter(), dto.getContent());
	}
	
	//글수정
	public void updateBoard(BoardDTO dto) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리");
		jdbcTemplate.update(BOARD_UPDATE, dto.getTitle(), dto.getContent(), dto.getSeq());
	}
	
	//글삭제
	public void deleteBoard(BoardDTO dto) {
		System.out.println("===> JDBC로 deleteBoard() 기능 처리");
		jdbcTemplate.update(BOARD_DELETE, dto.getSeq());
	}
	
	//글상세 조회
	public BoardDTO getBoard(BoardDTO dto) {
		System.out.println("===> JDBC로 getBoard() 기능 처리");
		Object[] args = {dto.getSeq()};	
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}
	
	//글 목록 조회
	public List<BoardDTO> getBoardList(BoardDTO dto) {
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		Object[] args = {dto.getSearchKeyword()};
		if(dto.getSearchCondition().equals("TITLE")) {
			return jdbcTemplate.query(BOARD_LIST_T, args, new BoardRowMapper());
		} else if(dto.getSearchCondition().equals("CONTENT")) {
			return jdbcTemplate.query(BOARD_LIST_C, args, new BoardRowMapper());
		}
		
		return null;
	} 
	
	
}

class BoardRowMapper implements RowMapper<BoardDTO> {
	public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDTO board = new BoardDTO();
		board.setSeq(rs.getInt("SEQ"));
		board.setTitle(rs.getString("TITLE"));
		board.setWriter(rs.getString("WRITER"));
		board.setContent(rs.getString("CONTENT"));
		board.setRegDate(rs.getDate("REGDATE"));
		board.setCnt(rs.getInt("CNT"));
		return board;
	}
}
