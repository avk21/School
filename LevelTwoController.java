package com.jspiders.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.school.entity.LevelTwo;
import com.jspiders.school.service.LevelTwoService;

@RestController
@RequestMapping(value = "/levelTwoController")
public class LevelTwoController {

	@Autowired
	private LevelTwoService levelTwoService;
	
	@GetMapping(value = "/getLevelTwo")
	public List<LevelTwo> getLevelTwo(LevelTwo levelTwo){
		return levelTwoService.getLevelTwo(levelTwo);
	}
	
	@PostMapping(value = "/saveLevelTwo")
	public void saveLevelTwo(@RequestBody LevelTwo levelTwo) {
		levelTwoService.saveLevelTwo(levelTwo);
	}
}


