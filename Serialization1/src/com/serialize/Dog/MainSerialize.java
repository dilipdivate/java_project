package com.serialize.Dog;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog();
		// Serialization started
		System.out.println("serialization started");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
	}

}
