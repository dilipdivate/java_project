package com.serialize1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MainSerialize {

	public static void main(String[] args) {

		List<Integer> app_list = new List<>();
        app_list.add(01);
        app_list.add(03);
        app_list.add(05);
        
        
		Building b1 = new Building("Lake Homes", 25, 100, 15, 85, app_list,007);
		//initializing an object of the Student class 
		String building_file = "Building_list"; // Naming the file from which the data will be deserialized
		  
		// Serialization
		try {
			FileOutputStream fos = new FileOutputStream(building_file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			
	    //Important to close both the ObjectInputStream and FileInputStream after reading from the file
		oos.close();
		fos.close();
		System.out.println("Object has been Serialize");
		}
		catch (IOException ie) {
			System.out.println("IOException has been caught");
		}
	}

}
