package kr.co.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.service.Board2Service;
import kr.co.vo.Board2VO;

@Controller
@RequestMapping("/board2/*")
public class Board2Controller {

	private static final Logger logger = LoggerFactory.getLogger(Board2Controller.class);
	
	@Inject
	Board2Service service;
	
	@RequestMapping(value="/board2/writeView", method=RequestMethod.GET)
	public void writeView() throws Exception {
		logger.info("/board2/write 경로입니다.");
	}
	
	@RequestMapping(value="/board2/write", method=RequestMethod.POST)
	public String write(Board2VO board2VO) throws Exception {
		logger.info("write");
		
		service.write(board2VO);
		
		return "redirect:/board2/list";
	}
	
}
