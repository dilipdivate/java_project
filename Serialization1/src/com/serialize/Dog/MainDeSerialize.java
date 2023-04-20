package com.serialize.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//Deserialization started
        System.out.println("Deserialization started");
        
        FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d2 = (Dog) ois.readObject();
		
		System.out.println("Deserialization ended");
		System.out.println("Dog object data");
		// final result
		System.out.println(d2.i + "\t" + d2.j);
	}

}
