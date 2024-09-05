package com.jspiders.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.school.entity.LevelThree;
import com.jspiders.school.repositary.LevelThreeRepositary;

@Service
public class LevelThreeService {

	@Autowired
	private LevelThreeRepositary levelThreeRepositary;
	
	public List<LevelThree> getLevelThree(LevelThree levelThree){
		return levelThreeRepositary.findAll();
	}

	public void savelevelThree(LevelThree levelThree) {
		levelThreeRepositary.save(levelThree);
	}
}
