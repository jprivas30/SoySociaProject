package com.projectgeneration.soysociaproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgeneration.soysociaproject.model.Comentario;
import com.projectgeneration.soysociaproject.repository.ComentarioRepository;

@Service
@Transactional
public class ComentarioService {
    
    private ComentarioRepository comentarioRepository;

    public ComentarioService(@Autowired ComentarioRepository comentarioRepository){
        this.comentarioRepository= comentarioRepository;
    }

    public void saveComentario(Comentario comentario){
        this.comentarioRepository.save(comentario);
    }
    
    public void updateComentario(Comentario comentario){
        this.comentarioRepository.save(comentario);
    }
    
    public void deleteComentario(Integer id){
        comentarioRepository.deleteById(id);
    }
    
    public List<Comentario> findAll(){
        return comentarioRepository.findAll();
    }
}
