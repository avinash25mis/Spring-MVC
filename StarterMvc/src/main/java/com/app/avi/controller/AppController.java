package com.app.avi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.avi.service.UserService;

import javax.annotation.PostConstruct;

@RestController
public class AppController {

	@Autowired
	UserService userService;  //Service which will do all data retrieval/manipulation work

	@RequestMapping(value = "/t", method = RequestMethod.GET)
	public String testApp(){

		return "running";
	}



	//-------------------Retrieve All Users--------------------------------------------------------
	


     @PostConstruct
	public void test(){

		 System.out.println("************************test**********");
    }

}
