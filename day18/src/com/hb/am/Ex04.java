package com.hb.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {

	public static void main(String[] args) {
		// Set - С§Че
//		Set set1= new HashSet();//TreeSet();
		Set set1= new TreeSet();
		set1.add(100);
		set1.add(3);
		set1.add(2);
		set1.add(7);
		System.out.println("size:"+set1.size());
		Iterator ite = set1.iterator();
		for(int i=0; i<set1.size(); i++){
			System.out.println(ite.next());
		}
		
		System.out.println("---------------------------------");
		ite = set1.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}






