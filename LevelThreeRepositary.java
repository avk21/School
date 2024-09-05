package com.jspiders.school.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspiders.school.entity.LevelThree;

@Repository
public interface LevelThreeRepositary extends JpaRepository<LevelThree, Long> {

}
