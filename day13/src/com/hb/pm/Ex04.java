package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("java");
		StringBuffer st1 = new StringBuffer(6);
		st1.append("java1");
		st1.append("java2");
		st1.append("java2");
		st1.append("java2");
		st1.delete(0, 5);
		System.out.println(st1+":"+st1.capacity());
		st1.setLength(6);
		st1.trimToSize();
		System.out.println(st1+":"+st1.capacity());
//		System.out.println(new String(new char[]{'2','3'}));
		//		System.out.println(st1);
	}

}
