package com.serialize.Aggregation;

import java.io.Serializable;

public class Student implements Serializable {
	int id;
	String name;
	Address address;// HAS-A

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//	Since Address is not Serializable, you cannot serialize the instance of the Student class.
	//	All the objects within an object must be Serializable.
}
