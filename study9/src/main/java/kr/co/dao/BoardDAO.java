package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVO;
import kr.co.vo.Criteria;
import kr.co.vo.SearchCriteria;

public interface BoardDAO {

	// 게시판 글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시판 글 목록
	public List<BoardVO> list(SearchCriteria scri) throws Exception;
	
	// 게시판 총 글 개수
	public int listCount(SearchCriteria scri) throws Exception;
	
	// 게시판 글 조회
	public BoardVO read(int bno) throws Exception;

	// 게시판 글 수정
	public void update(BoardVO boardVO) throws Exception;
	
	// 게시판 글 삭제
	public void delete(int bno) throws Exception;
	
}
