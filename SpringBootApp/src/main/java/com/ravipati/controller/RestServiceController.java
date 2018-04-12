package com.ravipati.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {
	
@RequestMapping("/")
public String getDefaultMessage(){
		return "Welcome to SpringBoot Application";
}
@RequestMapping("/hello")
public String getCustomMessage(){
	return "Hello ...Welcome to SpringBoot Application ";
}

}
