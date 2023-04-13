package com.projectgeneration.soysociaproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projectgeneration.soysociaproject.model.User;

public interface UserRepository extends JpaRepository <User, Integer>{
    
    @Query(value = "SELECT * FROM usuario WHERE rol='Colaboradora'", nativeQuery=true)
    List <User> findColaboradora();
    
}
