package com.projectgeneration.soysociaproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgeneration.soysociaproject.model.Tutorial;
import com.projectgeneration.soysociaproject.repository.TutorialRepository;

@Service
@Transactional
public class TutorialService {

    private TutorialRepository tutorialRepository;

    public TutorialService(@Autowired TutorialRepository tutorialRepository){
        this.tutorialRepository = tutorialRepository;
    }

    public void saveTutorial(Tutorial tutorial){
        this.tutorialRepository.save(tutorial);
    }
    
    public void updateTutorial(Tutorial tutorial){
        this.tutorialRepository.save(tutorial);
    }

    public void deleteTutorial(Integer id){
        tutorialRepository.deleteById(id);
    }
    
    public List<Tutorial> findAll(){
        return tutorialRepository.findAll();
    }

}
