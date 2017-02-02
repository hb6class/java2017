package com.hb.pm;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1234);
		arr.add("abcd");
		arr.add("23478");
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}
		System.out.println("-------------------------");
		arr.add(2, "xxxxx");
		arr.remove(2);
		arr.set(2, "zzzzzzz");
		for(int i=0; i<arr.size(); i++){
			System.out.println(arr.get(i));
		}

	}

}
