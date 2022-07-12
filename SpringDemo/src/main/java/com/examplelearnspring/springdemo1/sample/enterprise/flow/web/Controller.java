package com.examplelearnspring.springdemo1.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplelearnspring.springdemo1.sample.enterprise.flow.business.BusinessService;

//Sending response in the right format
@RestController
public class Controller {
	@Autowired
	private BusinessService businessService;
	//Hard coded value
	//"/sum"=>sum of values in array
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}

}



