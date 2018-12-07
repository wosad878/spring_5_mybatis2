package com.iu.s5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.iu.notice.NoticeDAO;
import com.iu.notice.NoticeDTO;

public class NoticeDAOTest extends AbstractTestCase {

	@Inject
	private NoticeDAO noticeDAO;
	
	@Test
	public void test() {
		List<NoticeDTO>ar = noticeDAO.list(1, 10, "ttt", "title");
		assertEquals(2, ar.size());
	}
//	@Test
//	public void test() {
//		NoticeDTO noticeDTO = new NoticeDTO();
//		noticeDTO.setTitle("DDDDDDD");
//		noticeDTO.setWriter("qweqwe");
//		noticeDTO.setContents("WEAAWEWEWAW");
//		int result = noticeDAO.insert(noticeDTO);
//		assertEquals(1, result);
//	}	
//	
//	@Test
//	public void test() {
//		NoticeDTO noticeDTO = noticeDAO.selectOne(30);
//		System.out.println(noticeDTO.getTitle());
//	}
//	@Test
//	public void test2() {
//		int result = noticeDAO.delete(29);
//		System.out.println(result);
//	}

}
