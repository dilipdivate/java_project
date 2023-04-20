package com.serialize1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeSerialize {

	public static void main(String[] args) {

		Building b1 = null; // initializing an object of the Building class
		String building_file = "Building_list"; // Naming the file from which the data will be deserialized

		// Deserialization
		try {
			FileInputStream fis = new FileInputStream(building_file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			b1 = (Building) ois.readObject();

			// Important to close both the ObjectInputStream and FileInputStream after
			// reading from the file
			ois.close();
			fis.close();
			System.out.println("Object has been deserialize");
			System.out.printf("Building name -> ", b1.building_name);
			System.out.printf("Number of Floors in Building -> ", b1.num_of_floors);
			System.out.printf("Number of Apartments in Building -> ", b1.num_of_apartments);
			System.out.printf("Number of unoccupied apartments -> ", b1.num_unoccupied);
			System.out.printf("Number of occupied apartments -> ", b1.num_occupied);

		} catch (IOException ie) {
			System.out.println("IOException has been caught");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Class Not Found Exception has been caught");
		}
	}

}
