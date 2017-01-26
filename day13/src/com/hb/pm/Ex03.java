package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		// 문자열
		// StringBuilder
		String s1="java";
		String s2="World";
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1);
		
		System.out.println("----------------------------");
		StringBuilder st1 = new StringBuilder("java");
		StringBuilder st2 = new StringBuilder("World");
		
		StringBuilder st3 = st1.append(st2);
		char[] buff1 = {'a','b','c'};
		// + - 추가
		st3.append(buff1);
		st3.append(12345);
		// 수정
		st3.replace(9, 12, "ok");
		// 삭제 
		st3.delete(0, 4);//st3.replace(0, 4, "");
		System.out.println(st3);
		// 중간에 추가
		st3.insert(5, "java");//st3.replace(5, 5, "java");
		System.out.println(st3);
		st3.reverse();
		System.out.println(st1);
		
		
	}

}











