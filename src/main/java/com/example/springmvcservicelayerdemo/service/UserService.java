package com.example.springmvcservicelayerdemo.service;

import com.example.springmvcservicelayerdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<User>();


    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        boolean found = false;
        for (User u : users) {
            if (u.getId() == user.getId()) {
                u.setName(user.getName());
                u.setAge(user.getAge());
                found = true;
            }
        }
        if (found == false) {
            users.add(user);
        }
    }

    public void removeUser(int id) {

        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                break;
            }
        }


    }
}
