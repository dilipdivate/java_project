package com.serialize2;

import java.io.Serializable;

public class Demo implements Serializable {
	public int a;
    public String b;
    
    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
    
    
}
