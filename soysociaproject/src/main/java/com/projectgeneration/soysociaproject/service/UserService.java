package com.projectgeneration.soysociaproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectgeneration.soysociaproject.model.User;
import com.projectgeneration.soysociaproject.repository.UserRepository;

@Service
@Transactional
public class UserService {
    
    private UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveUser(User user){
        this.userRepository.save(user);
    }
    
    public void updateUser(User user){
        this.userRepository.save(user);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
    
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findColaboradora(){
        return userRepository.findColaboradora();
    }

}
