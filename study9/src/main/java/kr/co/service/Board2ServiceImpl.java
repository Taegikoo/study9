package kr.co.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.dao.Board2DAO;
import kr.co.vo.Board2VO;

@Service
public class Board2ServiceImpl implements Board2Service {

	@Inject
	private Board2DAO dao;
	
	@Override
	public void write(Board2VO board2VO) throws Exception {
		dao.write(board2VO);
	}
	
}
