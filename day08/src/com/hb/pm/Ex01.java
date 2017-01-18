package com.hb.pm;

class Car{	// 자동차 객체
	String color;	//속성요소 - 명사(~이다)
	String name;
	
	void run(){		//기능요소 - 동사
		System.out.println("달린다");
	}
	void stop(){
		System.out.println("멈춘다");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.color="red";
		car.run();
	}

}
