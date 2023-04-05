package com.projectgeneration.soysociaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectgeneration.soysociaproject.model.Comentario;

public interface ComentarioRepository extends JpaRepository <Comentario, Integer>{
    
}
