package com.serialize2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerialize {

	public static void main(String[] args) {

		Demo d1 = new Demo(1, "Books");
		String filename = "file.ser";
		
		// Serialization
		try { 
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(d1);
			
			oos.close();
			fos.close();
			System.out.println("d1 has been serialized");
		}
		catch ( IOException ie) {
			System.out.println("IOException has been caught");
		}
		
	}

}
