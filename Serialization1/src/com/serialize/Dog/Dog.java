package com.serialize.Dog;

import java.io.Serializable;

public class Dog implements Serializable {
	 int i=10;
     transient final int j=20; //Now it will not be serialized   
}
