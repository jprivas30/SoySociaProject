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

import com.projectgeneration.soysociaproject.model.User;
import com.projectgeneration.soysociaproject.service.UserService;

@Controller
@CrossOrigin("*")
@RestController

public class UserController {
     
    private UserService userService;
    
    public UserController(@Autowired UserService userService){
        this.userService= userService;
    }
    
    @PostMapping("/user/Save")
    public void guardarUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @PutMapping("/user/Update")
    public void editaruser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/user/Delete/{id}")
    public void eliminaruser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

    @GetMapping("/user/FindAll")
    public List <User> obtenerUser(){
        return userService.findAll();
    }
}
