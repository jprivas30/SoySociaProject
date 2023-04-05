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

import com.projectgeneration.soysociaproject.model.TutorialUsuario;
import com.projectgeneration.soysociaproject.service.TutorialUsuarioService;

@Controller
@CrossOrigin("*")
@RestController
public class TutorialUsuarioController {
    
    private TutorialUsuarioService tutorialUsuarioService;
    
    public TutorialUsuarioController(@Autowired TutorialUsuarioService tutorialUsuarioService){
        this.tutorialUsuarioService= tutorialUsuarioService;
    }
    
    @PostMapping("/tutorialUsuario/Save")
    public void guardarTutorialUsuario(@RequestBody TutorialUsuario tutorialUsuario){
        tutorialUsuarioService.saveTutorial(tutorialUsuario);
    }

    @PutMapping("/tutorialUsuario/Update")
    public void editartutorialUsuario(@RequestBody TutorialUsuario tutorialUsuario){
        tutorialUsuarioService.updateTutorial(tutorialUsuario);
    }

    @DeleteMapping("/tutorialUsuario/Delete/{id}")
    public void eliminartutorialUsuario(@PathVariable Integer id){
        tutorialUsuarioService.deleteTutorialUsuario(id);
    }

    @GetMapping("/tutorialUsuario/FindAll")
    public List <TutorialUsuario> obtenerTutorialUsuario(){
        return tutorialUsuarioService.findAll();
    }
}

