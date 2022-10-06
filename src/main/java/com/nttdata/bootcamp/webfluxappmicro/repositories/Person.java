package com.nttdata.bootcamp.webfluxappmicro.repositories;

public class Person {
	
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Person(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

}