package com.hb.am;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex07 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1111);
		set.add(2222);
		set.add(3333);
		set.add(1111);
		
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		System.out.println("---------------------------------");
		for(Integer tmp : set){	// 배열 & 컬렉션프레임워크
			System.out.println(tmp);
		}

	}

}
