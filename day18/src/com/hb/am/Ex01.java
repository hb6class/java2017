package com.hb.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		// crud
		
		List alist = new LinkedList();
		System.out.println("size:"+alist.size());
		alist.add("하나");
		System.out.println("size:"+alist.size()+",val:"+alist.get(0));
		alist.add("둘");
		System.out.println("size:"+alist.size()+",val:"+alist.get(1));
		alist.add("셋");
		System.out.println("size:"+alist.size()+",val:"+alist.get(2));
		alist.add("다섯");
		System.out.println("size:"+alist.size()+",val:"+alist.get(3));
		alist.add(3, "4");
		alist.set(3, "넷");
		alist.remove(1);
		for(int i=0; i<alist.size(); i++){
			System.out.println(alist.get(i));
		}
	}

}


