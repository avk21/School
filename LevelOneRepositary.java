package com.jspiders.school.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.school.entity.LevelOne;

@Repository
public interface LevelOneRepositary extends JpaRepository<LevelOne, Long> {

}
