package com.hb.pm;

class Parents{	
	// 부모클래스, super클래스, 상위 클래스, 기본클래스
	int num=100;
	
	void func01(){
		num+=10;
	}
//	void func01(int a){}
}

public class Ex02 extends Parents { 
	// 자식 클래스, 하위 클래스, 유도클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02();
		System.out.println(me.num);
		me.func01(50);
		System.out.println(me.num);
		
	}
	
//	@Override	// @어노테이션, 규약
	void func01(int su) {
		super.func01();
		System.out.println(su+"를 누적 안하겠음");
	}
}














