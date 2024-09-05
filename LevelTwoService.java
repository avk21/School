package com.jspiders.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.school.entity.LevelTwo;
import com.jspiders.school.repositary.LevelTwoRepositary;

@Service
public class LevelTwoService {

	@Autowired
	private LevelTwoRepositary levelTwoRepositary;
	
	
	public List<LevelTwo> getLevelTwo(LevelTwo levelTwo){
		return levelTwoRepositary.findAll();
	}
	
	public void saveLevelTwo(LevelTwo levelTwo) {
		levelTwoRepositary.save(levelTwo);
	}
}
