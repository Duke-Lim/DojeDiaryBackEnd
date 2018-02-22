package com.diary.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.diary.service.DiaryService;
import com.diary.util.Utils;
import com.diary.vo.DiaryVO;

@RestController
public class DiaryController {

	@Autowired
	private DiaryService diaryService;
	
	@ResponseBody
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<DiaryVO> alldiary() {
		List<DiaryVO> list = diaryService.getAllDiary();
		
		System.out.println(list.toString());
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/{id}", produces = "application/json", method = RequestMethod.GET)
	public DiaryVO diary(@PathVariable int id) {
		DiaryVO diaryVO = diaryService.getDiary(id);
		
		System.out.println(diaryVO.toString());
		
		return diaryVO;
	}
	
	@RequestMapping(value = "/", produces = "application/json", method = RequestMethod.POST, consumes = "application/json")
	public String insertDiary(@RequestBody HashMap<String, Object> reqMap) {
		reqMap = Utils.changeToUpperMapKey(reqMap);
		
		System.out.println(reqMap.toString());

		int n = diaryService.insertDiary(reqMap);
		
		return (n>0) ? "성공":"실패";
	}
	
	@RequestMapping(value = "/", produces = "application/json", method = RequestMethod.PUT, consumes = "application/json")
	public String updateDiary(@RequestBody HashMap<String, Object> reqMap) {
		reqMap = Utils.changeToUpperMapKey(reqMap);
		
		System.out.println(reqMap.toString());
		
		int n = diaryService.updateDiary(reqMap);
		
		return (n>0) ? "성공":"실패";
	}
	
	@RequestMapping(value = "/{id}", produces = "application/json", method = RequestMethod.DELETE)
	public String updateDiary(@PathVariable("id") int id) {
		int n = diaryService.deleteDiary(id);
		
		System.out.println(n);
		
		return (n>0) ? "성공":"실패";
	}
}
