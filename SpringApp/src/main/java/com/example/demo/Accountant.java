package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{

	@Override
	public void doWork() {
		
		System.out.println("Audit the accounts");
		
	}
	
	

}

