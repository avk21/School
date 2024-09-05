package com.jspiders.school.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.school.entity.LevelTwo;

@Repository
public interface LevelTwoRepositary extends JpaRepository<LevelTwo, Long>{

}
