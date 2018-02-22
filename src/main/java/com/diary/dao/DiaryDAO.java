package com.diary.dao;

import java.util.HashMap;
import java.util.List;

import com.diary.vo.DiaryVO;

public interface DiaryDAO {
	public List<DiaryVO> getAllDiary();
	public DiaryVO getDiary(int id);
	public int insertDiary(HashMap<String, Object> reqMap);
	public int updateDiary(HashMap<String, Object> reqMap);
	public int deleteDiary(int id);
}
