package com.myapp.dao;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleTon {

	private static SessionFactory sessfionfactory;
	static Logger log = Logger.getLogger("SingleTon");
	
	static{
		sessfionfactory = new Configuration().configure().buildSessionFactory();
		log.info("<***************connection :) ************>"); 
	}
	private SingleTon() {
		// TODO Auto-generated constructor stub
	}
	public static SessionFactory getSessfionfactory() {
		return sessfionfactory;
	}
}
