package com.serialize.Employee;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialversionUID = 1234L;
	transient int a; //Now it will not be serialized   
	static int b;
	String name;
	int age;

	// Default constructor
	public Employee(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}
}
