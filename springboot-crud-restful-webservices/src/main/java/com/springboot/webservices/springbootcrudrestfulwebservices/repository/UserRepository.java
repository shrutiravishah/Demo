package com.springboot.webservices.springbootcrudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.webservices.springbootcrudrestfulwebservices.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
