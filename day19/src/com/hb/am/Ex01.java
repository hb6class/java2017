package com.hb.am;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Box{}

public class Ex01 {

	public static void main(String[] args) {
		// 제네릭(1.4~ 발생)
		String st1 = "adbc";
		int num1 = 1234;

		ArrayList<Object> alist1 = new ArrayList<Object>();
		alist1.add(st1);
		alist1.add(num1);
		alist1.add(new Box());
//		int a = alist1.get(0);
//		String b = alist1.get(1).toString();
//		System.out.println(alist1.get(1).toString());
//		for(int i=0; i<alist1.size(); i++){
//			System.out.println(alist1.get(i));
//		}
		
		// 자료구조에 들어갈수 있는 자료타입을 한정
		ArrayList<String> alist2 = new ArrayList<String>();
		// 자료구조<타입:객체자료형>
		alist2.add(st1);
		
		String st2=alist2.get(0);
		System.out.println(st2);
		
		ArrayList<Integer> alist3 = new ArrayList<Integer>();
		alist3.add(num1);
		alist3.add(4325);
		
		int tmp1= alist3.get(0);
		
		Set<String> set = new HashSet<String>();
		set.add("tttt");
		set.add(new String("java"));
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			String temp=ite.next();	
		}
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("a", "aa");
	}

}







