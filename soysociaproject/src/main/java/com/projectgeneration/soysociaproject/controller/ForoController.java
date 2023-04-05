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

import com.projectgeneration.soysociaproject.model.Foro;
import com.projectgeneration.soysociaproject.service.ForoService;

@Controller
@CrossOrigin("*")
@RestController
public class ForoController {
    
    private ForoService foroService;
    
    public ForoController(@Autowired ForoService foroService){
        this.foroService= foroService;
    }
    
    @PostMapping("/foro/Save")
    public void guardarForo(@RequestBody Foro foro){
        foroService.saveForo(foro);
    }

    @PutMapping("/foro/Update")
    public void editarForo(@RequestBody Foro foro){
        foroService.updateForo(foro);
    }

    @DeleteMapping("/foro/Delete/{id}")
    public void eliminarForo(@PathVariable Integer id){
        foroService.deleteForo(id);
    }

    @GetMapping("/foro/FindAll")
    public List <Foro> obtenerForo(){
        return foroService.findAll();
    }
}
