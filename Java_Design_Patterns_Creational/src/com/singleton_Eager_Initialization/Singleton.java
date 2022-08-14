package com.singleton_Eager_Initialization;

public class Singleton {

	
	private static final Singleton SINGLE = new Singleton();
	
	private Singleton()  {
		
		// Creating private Constructor So from out side of this class any one Can't access 
		// this Constructor.
		
	}
	
	public static Singleton getSingleton() {
		
		// static method so we can call without creating Object also.
		// Factory Method
		
		return SINGLE;
	}
	
}
