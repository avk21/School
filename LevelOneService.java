package com.jspiders.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.school.entity.LevelOne;
import com.jspiders.school.repositary.LevelOneRepositary;

@Service
public class LevelOneService {

	@Autowired
	private LevelOneRepositary levelOneRepositary;
	
	public List<LevelOne> getLevelOne(LevelOne levelOne){
		return levelOneRepositary.findAll();
	}
	
	public void saveLevelOne(LevelOne levelOne) {
		levelOneRepositary.save(levelOne);
	}
}
