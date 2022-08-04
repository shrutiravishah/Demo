package com.demo.learningjpa;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.learningjpa.entity.User;
import com.demo.learningjpa.service.UserDAOService;

import ch.qos.logback.classic.Logger;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log =  (Logger) LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDAOService;
	
	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack","Admin");
		@SuppressWarnings("unused")
		long insert = userDAOService.insert(user);
		log.info("New User is created: "+user);
	}
	
}
