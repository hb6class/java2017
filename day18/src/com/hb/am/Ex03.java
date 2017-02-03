package com.hb.am;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Ex03 {

	public static void main(String[] args) {
		// Vector
		Vector vec1 = new Vector();

		System.out.println("vec size:"+vec1.size());
		System.out.println("vec capacity:"+vec1.capacity());
		vec1.add("하나");
		vec1.add("둘");
		vec1.add("셋");
		vec1.add("넷");
		vec1.remove(2);
		for(int i=0; i<vec1.size(); i++){
			System.out.println(vec1.get(i));
		}
		System.out.println("--------------------------");
		Vector vec2 = new Vector(5,3);
		vec2.add("추가1");
		vec2.add("추가2");
		vec2.add("추가3");
		vec2.add("추가4");
		vec2.add("추가5");
		vec2.add("추가6");
		vec2.add(2,"zzzz");
//		vec2.add("추가7");
		System.out.println("vec size:"+vec2.size());
		System.out.println("vec capacity:"+vec2.capacity());
		System.out.println("--------------------------");
		Vector vec3 = new Vector();
		vec3.addElement("a1");
		vec3.addElement("a2");
		vec3.addElement("a3");
		vec3.addElement("a4");
		vec3.insertElementAt("bbbbb",2);
		vec3.setElementAt("11", 0);
		vec3.removeElementAt(4);
		System.out.println(vec3.firstElement());
		System.out.println(vec3.lastElement());
//		vec3.removeAllElements();
		System.out.println("vec size:"+vec3.size());
		System.out.println("--------------------------");
		// Vector 만의 ~v1.2
		Enumeration ele = vec3.elements();
		while(ele.hasMoreElements()){
			System.out.println(ele.nextElement());
		}
		System.out.println("--------------------------");
		// 
		for(int i=0; i<vec3.size(); i++){
			System.out.println(vec3.elementAt(i));
		}
		System.out.println("--------------------------");
		// List
		for(int i=0; i<vec3.size(); i++){
			System.out.println(vec3.get(i));
		}
		System.out.println("--------------------------");
		// Set
		Iterator ite = vec3.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}

}














