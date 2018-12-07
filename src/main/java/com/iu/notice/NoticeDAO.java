package com.iu.notice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Inject
	private SqlSession session;
	private String namespace="noticeMapper.";

	public List<NoticeDTO> list(int startRow, int lastRow, String search, String kind){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startRow", startRow);
		map.put("lastRow", lastRow);
		map.put("search", search);
		map.put("kind", kind);
		return session.selectList(namespace+"selectList", map);
	}
	
	public int insert(NoticeDTO noticeDTO) {
		return session.insert(namespace+"ins", noticeDTO);
	}
	
	public NoticeDTO selectOne(int num) {
		//글 하나 조회 
	return session.selectOne(namespace+"selectOne", num);
	}
	public int delete(int num) {
		return session.delete(namespace+"del", num);
	}
}
