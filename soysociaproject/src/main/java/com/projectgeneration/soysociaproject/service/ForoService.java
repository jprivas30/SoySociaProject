package com.projectgeneration.soysociaproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgeneration.soysociaproject.model.Foro;
import com.projectgeneration.soysociaproject.repository.ForoRepository;

@Service
@Transactional
public class ForoService {
    
    private ForoRepository foroRepository;

    public ForoService(@Autowired ForoRepository foroRepository){
        this.foroRepository = foroRepository;
    }

    public void saveForo(Foro foro){
        this.foroRepository.save(foro);
    }
    
    public void updateForo(Foro foro){
        this.foroRepository.save(foro);
    }

    public void deleteForo(Integer id){
        foroRepository.deleteById(id);
    }
    
    public List<Foro> findAll(){
        return foroRepository.findAll();
    }

}
