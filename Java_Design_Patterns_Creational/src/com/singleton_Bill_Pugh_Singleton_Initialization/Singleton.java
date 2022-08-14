package com.singleton_Bill_Pugh_Singleton_Initialization;


public class Singleton {
	
	
	
	private Singleton()  {
		
		// Creating private Constructor So from out side of this class any one Can't access 
		// this Constructor.
	}
	public static class HolderSingleton{
		private static final Singleton SINGLE = new Singleton();
		
	}
	
	public static  Singleton getSingleton()  {
		// static method so we can call without creating Object also.
		// Factory Method
		return HolderSingleton.SINGLE;
	}
}