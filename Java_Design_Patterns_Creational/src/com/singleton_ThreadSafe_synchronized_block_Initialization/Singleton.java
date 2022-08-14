package com.singleton_ThreadSafe_synchronized_block_Initialization;


public class Singleton {
	
	private static Singleton SINGLE = null;
	
	private Singleton()  {
		
		// Creating private Constructor So from out side of this class any one Can't access 
		// this Constructor.
	}
	
	public static synchronized Singleton getSingleton() throws InterruptedException {
		// static method so we can call without creating Object also.
		// Factory Method
		if (SINGLE==null) {
			synchronized(Singleton.class) {
				if (SINGLE==null) {
			Thread.sleep(2000);
			SINGLE = new Singleton();
				}
			}
		}
		return SINGLE;
	}
}