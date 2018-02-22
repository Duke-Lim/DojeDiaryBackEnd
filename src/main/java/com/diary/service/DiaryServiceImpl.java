package com.diary.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diary.dao.DiaryDAO;
import com.diary.vo.DiaryVO;

@Service("DiaryService")
public class DiaryServiceImpl implements DiaryService {

	@Autowired
	private DiaryDAO diaryDAO;

	@Override
	public List<DiaryVO> getAllDiary() {
		return diaryDAO.getAllDiary();
	}

	@Override
	public DiaryVO getDiary(int id) {
		return diaryDAO.getDiary(id);
	}

	@Override
	public int insertDiary(HashMap<String, Object> reqMap) {
		return diaryDAO.insertDiary(reqMap);
	}

	@Override
	public int updateDiary(HashMap<String, Object> reqMap) {
		return diaryDAO.updateDiary(reqMap);
	}

	@Override
	public int deleteDiary(int id) {
		return diaryDAO.deleteDiary(id);
	}
	
}
