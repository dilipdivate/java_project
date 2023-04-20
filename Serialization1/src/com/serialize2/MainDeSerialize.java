package com.serialize2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeSerialize {

	public static void main(String[] args) {

		Demo d1 = null;
		String filename = "file.ser";

		// DeSerialization
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);

			d1 = (Demo) ois.readObject();
			ois.close();
			fis.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + d1.a);
			System.out.println("b = " + d1.b);
		} catch (IOException ie) {
			System.out.println("IOException caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFound Exception caught");
		}

	}

}
