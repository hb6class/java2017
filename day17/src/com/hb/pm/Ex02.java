package com.hb.pm;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1234);
		arr.add("abcd");
		arr.add(1234);
		arr.add(1234);
		arr.add("23478");
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
		System.out.println(arr.remove(2));
		System.out.println(arr.remove(new Integer(1234)));
		System.out.println("-------------------------");
		ArrayList arr2=(ArrayList) arr.clone();
		
		arr.add(2, "xxxxx");
		arr.remove(2);
		arr.set(2, "zzzzzzz");
		
		System.out.println(arr2.contains(1234));
		System.out.println(arr2.indexOf(1234));
		System.out.println(arr2.lastIndexOf(1234));
//		arr2.clear();
		System.out.println(arr2.isEmpty());
		for(int i=0; i<arr2.size(); i++){
			System.out.println(arr2.get(i));
		}

	}

}
