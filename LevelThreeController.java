package com.jspiders.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.school.entity.LevelThree;
import com.jspiders.school.service.LevelThreeService;

@RestController
@RequestMapping(value = "/levelThreeController")
public class LevelThreeController {

	@Autowired
	private LevelThreeService levelThreeService;
	
	@GetMapping(value = "/getLevelThree")
	public List<LevelThree> getLevelThree(LevelThree levelThree){
		return levelThreeService.getLevelThree(levelThree);
	}
	
	@PostMapping(value = "/savelevelThree")
	public void savelevelThree(@RequestBody LevelThree levelThree) {
		levelThreeService.savelevelThree(levelThree);
	}
}
