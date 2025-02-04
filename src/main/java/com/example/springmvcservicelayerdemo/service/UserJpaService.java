package com.example.springmvcservicelayerdemo.service;

import com.example.springmvcservicelayerdemo.model.User;
import com.example.springmvcservicelayerdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJpaService {

    @Autowired
    UserRepository userRepository ;

    // add user

    public void Add(User user) {

        userRepository.save(user);
    }
    //read
    public List<User> GetUsers() {     // read
        return userRepository.findAll();
    }


    //delete

    public void Delete(int id) {
        userRepository.deleteById(id);
    }

    //update
    public void Update(User user) {
        userRepository.save(user);
    }
}
