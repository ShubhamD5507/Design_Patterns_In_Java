package com.singleton_ThreadSafe_synchronized_block_Initialization;

public class TestSingleton extends Thread {

	public void run() {
		
		Singleton singleton= null;
		try {
			singleton = Singleton.getSingleton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Child Thread Calling ..."+singleton.hashCode());
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestSingleton t1 = new TestSingleton();
		t1.start();
		Singleton s1 = Singleton.getSingleton();
		System.out.println("Main Thread Calling ..."+s1.hashCode());
		
	}
}