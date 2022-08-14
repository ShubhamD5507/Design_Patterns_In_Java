package com.singleton_static_Initialization;

public class Singleton {
	
	private static Singleton SINGLE = null;
	
	private Singleton()  {
		
		// Creating private Constructor So from out side of this class any one Can't access 
		// this Constructor.
		
	}

		// It is also same like eager approach only difference is that in this case we can write 
		// try - catch block and Handle Exception
	
	static {
		try {
			if (SINGLE==null) {
				
				SINGLE = new Singleton();
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
	}
	public static Singleton getSingleton() {
		
		// static method so we can call without creating Object also.
		// Factory Method
		
		return SINGLE;
	}
}
