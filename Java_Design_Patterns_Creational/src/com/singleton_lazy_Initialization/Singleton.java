package com.singleton_lazy_Initialization;

public class Singleton {
	
	private static  Singleton SINGLE;
	
	private Singleton()  {
		
		// Creating private Constructor So from out side of this class any one Can't access 
		// this Constructor.
	}

	public static Singleton getSingleton() {
		
		// static method so we can call without creating Object also.
		// Factory Method
		// if reference is null then only we will return the instance
		
		if (SINGLE==null) {
			
			SINGLE = new Singleton();
		}
		return SINGLE;
	}
}