package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bank {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Manager employee = context.getBean(Manager.class);
		employee.doWork();
		context.close();

	}

}
