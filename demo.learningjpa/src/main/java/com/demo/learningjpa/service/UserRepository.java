package com.demo.learningjpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.learningjpa.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
