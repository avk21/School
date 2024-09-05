package com.jspiders.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.school.entity.LevelOne;
import com.jspiders.school.service.LevelOneService;

@RestController
@RequestMapping(value = "/levelOneController")
public class LevelOneController {

	@Autowired
	private LevelOneService levelOneService;
	
	@GetMapping(value = "/getLevelOne")
	public List<LevelOne> getLevelOne(LevelOne levelOne){
		return levelOneService.getLevelOne(levelOne);
	}
	
	@PostMapping(value = "/saveLevelOne")
	public void saveLevelOne(@RequestBody LevelOne levelOne) {
		levelOneService.saveLevelOne(levelOne);
	}
}
