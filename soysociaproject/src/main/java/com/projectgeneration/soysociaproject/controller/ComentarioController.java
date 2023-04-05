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

import com.projectgeneration.soysociaproject.model.Comentario;
import com.projectgeneration.soysociaproject.service.ComentarioService;

@Controller
@CrossOrigin("*")
@RestController
public class ComentarioController {
    
    private ComentarioService comentarioService;
    
    public ComentarioController(@Autowired ComentarioService comentarioService){
        this.comentarioService= comentarioService;
    }
    
    @PostMapping("/comentario/Save")
    public void guardarComentario(@RequestBody Comentario comentario){
        comentarioService.saveComentario(comentario);
    }

    @PutMapping("/comentario/Update")
    public void editarComentario(@RequestBody Comentario comentario){
        comentarioService.updateComentario(comentario);
    }

    @DeleteMapping("/comentario/Delete/{id}")
    public void eliminarComentario(@PathVariable Integer id){
        comentarioService.deleteComentario(id);
    }

    @GetMapping("/comentario/FindAll")
    public List <Comentario> obtenerForo(){
        return comentarioService.findAll();
    }
}
