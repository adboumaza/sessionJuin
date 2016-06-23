package com.myapp.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myapp.entitis.Client;
import com.myapp.service.IclientService;

public class Test {

	public static void main(String[] args) {
		 IclientService service;
		 ClassPathXmlApplicationContext context;
		 
		 context = new ClassPathXmlApplicationContext("app.xml");
		 service =(IclientService) context.getBean("serviceClient");
		 
		 
		 service.addClient(new Client("","", 25));
	}
}
