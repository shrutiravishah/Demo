package com.demo.learningjpa.service;

import org.springframework.stereotype.Repository;

import com.demo.learningjpa.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserDAOService {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}
}
