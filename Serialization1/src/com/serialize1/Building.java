package com.serialize1;

import java.io.Serializable;
import java.util.List;

public class Building implements Serializable   {

	public String building_name;
	public int num_of_floors;
	public int num_of_apartments;
	public int num_unoccupied;
	public int num_occupied;
	public List<Integer> list_of_occupied;
    public transient int pin;
	
//	Important points to remember while implementing object serialization in java:
//		Serializable is a marker interface — it does not consist of any methods or data members. If a java class implements a Serializable interface it gets certain capabilities. It is also important to note that objects of a class can only be serialized if the class implements the Serializable interface.
//		Only non-static members of a class are serialized. Static members and transient data members are not serialized.
//		If the parent class has implemented serializable the child class does not need to implement it.
//		Associated objects must implement the Serializable Interface.
//		The constructor of an object is never called when deserialization takes place.

	public Building(String building_name, int num_of_floors, int num_of_apartments, int num_unoccupied,
			int num_occupied, List<Integer> list_of_occupied, int pin) {
		super();
		this.building_name = building_name;
		this.num_of_floors = num_of_floors;
		this.num_of_apartments = num_of_apartments;
		this.num_unoccupied = num_unoccupied;
		this.num_occupied = num_occupied;
		
		this.list_of_occupied = list_of_occupied;
        this.pin = pin;
	}
	
	
}
