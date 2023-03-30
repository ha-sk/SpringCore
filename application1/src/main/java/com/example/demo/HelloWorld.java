package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
		
		// charge Bean et definition XML a partir du fichier xml donne
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService obj = context.getBean(HelloWorldService.class);
		obj.hello();
		context.close();

	}

}



