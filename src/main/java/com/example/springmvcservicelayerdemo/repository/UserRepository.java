package com.example.springmvcservicelayerdemo.repository;

import com.example.springmvcservicelayerdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
}
