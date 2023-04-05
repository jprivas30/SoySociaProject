package com.projectgeneration.soysociaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgeneration.soysociaproject.model.User;

public interface UserRepository extends JpaRepository <User, Integer>{
    
}
