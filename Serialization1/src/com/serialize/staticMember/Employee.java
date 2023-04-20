package com.serialize.staticMember;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	static String company = "SSS IT Pvt Ltd";// it won't be serialized

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
