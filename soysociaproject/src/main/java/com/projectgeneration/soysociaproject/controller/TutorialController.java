package com.projectgeneration.soysociaproject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectgeneration.soysociaproject.model.Tutorial;
import com.projectgeneration.soysociaproject.service.TutorialService;

@Controller
@CrossOrigin("*")
@RestController
public class TutorialController {
    
    private TutorialService tutorialService;
    
    public TutorialController(@Autowired TutorialService tutorialService){
        this.tutorialService= tutorialService;
    }
    
    @PostMapping("/tutorial/Save")
    public void guardarTutorial(@RequestBody Tutorial tutorial){
        tutorialService.saveTutorial(tutorial);
    }

    @PutMapping("/tutorial/Update")
    public void editartutorial(@RequestBody Tutorial tutorial){
        tutorialService.updateTutorial(tutorial);
    }

    @DeleteMapping("/tutorial/Delete/{id}")
    public void eliminarTutorial(@PathVariable Integer id){
        tutorialService.deleteTutorial(id);
    }

    @GetMapping("/tutorial/FindAll")
    public List <Tutorial> obtenerTutorial(){
        return tutorialService.findAll();
    }

}
