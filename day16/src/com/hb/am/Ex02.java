package com.hb.am;

abstract class 도형{
	int 길이=10;
	void func(){
		draw();
	}
	abstract void draw();
}

class 사각형 extends 도형{
	@Override
	void draw() {
		System.out.println("길이가 "+길이+"cm인 사각형을 그립다");
	}
}

class 원 extends 도형 {
	@Override
	void draw() {
		System.out.println("지름이 " +길이+"cm인 원을 그린다");
	}
}

public class Ex02 {

	public static void main(String[] args) {
//		원 obj1 = new 원();
//		obj1.draw();
//		사각형 obj2 = new 사각형();
//		obj2.draw();
		도형 obj3 = new 원();
		obj3.draw();
		obj3 = new 사각형();
		obj3.draw();
		
	}

}













