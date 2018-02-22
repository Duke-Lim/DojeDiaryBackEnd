package com.diary.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.diary.vo.DiaryVO;

@Repository("DiaryDAO")
public class DiaryDAOImpl implements DiaryDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<DiaryVO> getAllDiary() {
		return sqlSession.selectList("getAllDiary");
	}

	@Override
	public DiaryVO getDiary(int id) {
		return sqlSession.selectOne("getDiary", id);
	}

	@Override
	public int insertDiary(HashMap<String, Object> reqMap) {
		return sqlSession.insert("insertDiary", reqMap);
	}

	@Override
	public int updateDiary(HashMap<String, Object> reqMap) {
		return sqlSession.update("updateDiary", reqMap);
	}

	@Override
	public int deleteDiary(int id) {
		return sqlSession.delete("deleteDiary", id);
	}

}
