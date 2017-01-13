package com.hb.pm;

public class Ex01 {
	// 메소드
	// return (o) = 자료형 메소드명(인자){return o;}
	// return (x) = void 메소드명(인자){}
	public static void func(String name){
		System.out.println(prnt(name));
//		return;
	}
	
	public static String prnt(String name){ //메소드
		return name;
	}

	public static void main(String[] args) {
		// helloWorld
		String prn="hello Java";
		func(prn);
		return;
	}
	

}
