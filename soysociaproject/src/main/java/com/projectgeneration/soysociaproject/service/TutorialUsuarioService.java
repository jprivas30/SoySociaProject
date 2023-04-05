package com.projectgeneration.soysociaproject.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgeneration.soysociaproject.model.TutorialUsuario;
import com.projectgeneration.soysociaproject.repository.TutorialUsuarioRepository;

@Service
@Transactional
public class TutorialUsuarioService {
    
    private TutorialUsuarioRepository tutorialusuarioRepository;

    public TutorialUsuarioService(@Autowired TutorialUsuarioRepository tutorialusuarioRepository){
        this.tutorialusuarioRepository = tutorialusuarioRepository;
    }

    public void saveTutorial(TutorialUsuario tutorialusuario){
        this.tutorialusuarioRepository.save(tutorialusuario);
    }
    
    public void updateTutorial(TutorialUsuario tutorialusuario){
        this.tutorialusuarioRepository.save(tutorialusuario);
    }

    public void deleteTutorialUsuario(Integer id){
        tutorialusuarioRepository.deleteById(id);
    }
    
    public List<TutorialUsuario> findAll(){
        return tutorialusuarioRepository.findAll();
    }

}
