package com.projectgeneration.soysociaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgeneration.soysociaproject.model.Tutorial;

public interface TutorialRepository extends JpaRepository <Tutorial, Integer>{
    
}