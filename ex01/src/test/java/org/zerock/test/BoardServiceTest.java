package org.zerock.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardServiceTest {
	
	@Inject
	private BoardService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceTest.class);
	
	/* @Test
	public void testRegist() throws Exception {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로운 내용1");
		board.setContent("새로운 내용1");
		board.setWriter("user00");
		service.regist(board);
	} */
	
	/* @Test
	public void testRead() throws Exception {
		
		logger.info(service.read(1).toString());
	} */
	
	/* @Test
	public void testModify() throws Exception {
		
		BoardVO board = new BoardVO();
		board.setBno(1);
		board.setTitle("수정된 내용2");
		board.setContent("수정된 내용2");
		board.setWriter("user00");
		service.modify(board);
	} */
	
	@Test
	public void testDelete() throws Exception {
		
		service.remove(1);
	}
	
}
