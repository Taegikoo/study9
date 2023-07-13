package kr.co.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.Board2VO;

@Repository
public class Board2DAOImpl implements Board2DAO {
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public void write(Board2VO board2VO) throws Exception {
		sqlSession.insert("boardMapper2.insert", board2VO);
	}

	

}
