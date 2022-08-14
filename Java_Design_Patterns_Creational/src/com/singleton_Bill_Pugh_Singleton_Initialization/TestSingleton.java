package com.singleton_Bill_Pugh_Singleton_Initialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.WeakHashMap;

public class TestSingleton extends Thread {

	public void run() {
		
		Singleton singleton= null;
		singleton = Singleton.getSingleton();
		System.out.println("Child Thread Calling ..."+singleton.hashCode());
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {
		
		TestSingleton t1 = new TestSingleton();
		t1.start();
		Singleton s1 = Singleton.getSingleton();
		System.out.println("Main Thread Calling ..."+s1.hashCode());
		
		
	}
}