package com.serialize.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialize {

	public static void printdata(Employee object1)
    {
 
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }
	
	public static void main(String[] args) {

		Employee e1 = new Employee("ab", 20, 2, 1000);
        String filename = "dilip.txt";
        
        // Serialization
        try {
 
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                                           (filename);
            ObjectOutputStream out = new ObjectOutputStream
                                           (file);
 
            // Method for serialization of object
            out.writeObject(e1);
            out.flush();
            out.close();
            file.close();
 
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization.");
            printdata(e1);
 
            // value of static variable changed
            e1.b = 2000;
        }
 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
	}

}
