package com.hb.am;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
//		Math - 수학
		System.out.println(abs(100));
		System.out.println(abs(-50));
		System.out.println(Math.abs(8));
		System.out.println(Math.abs(-8));
		System.out.println(Math.abs(3.14));
		System.out.println(Math.abs(-3.14));
		System.out.println("버림:"+Math.floor(3.14));
		System.out.println("floor:"+Math.floor(3.64));
		System.out.println("올림:"+Math.ceil(3.14));
		System.out.println("ceil:"+Math.ceil(3.64));
		System.out.println("반올림:"+Math.rint(3.14));
		System.out.println("rint:"+Math.rint(3.64));
		int a=100;
		int b=200;
		System.out.println(a+"와 "+b+" 중 큰수는 "+Math.max(a,b));
		System.out.println(a+"와 "+b+" 중 작은수는 "+Math.min(a,b));
		System.out.println("랜덤수(>=0, <1):"+Math.random());
		Random ran = new Random();
		System.out.println("Random class "+(ran.nextInt(45)+1));
		System.out.println("Random class "+ran.nextDouble());
		
	}
	// 절대값을 반환
	public static int abs(int a){
		if(a<0){
			a=-a;
		}
		return a;
	}
}
