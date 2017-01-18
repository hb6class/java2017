package com.hb.am;

class Car{
	// 객체 - 속성, 기능
	int max=0;//속성
	int speed=0;
	String company;
	String model;
	String color;
	
	void setMax(int su){
		if(su<350){
			max=su;
		}else{
			max=349;
		}
	}
	void speedUp(int up){ // 기능요소
		if(speed+up<=max){
			speed+=up;
			}else{
				speed=max;
			}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Car car1 = new Car(); // 소나타
		car1.company="현대";
		car1.model="소나타";
		car1.color="검정색";
		
		Car car2 = new Car(); // 모닝
		car2.company="기아";
		car2.model="모닝";
		car2.color="핑크색";
		
		car1.setMax(250);
		car2.setMax(180);
		
		System.out.println(car1.color+car1.model+"의 현재속도는 시속"
				+car1.speed+"km 입니다");
		System.out.println(car2.color+car2.model+"의 현재속도는 시속"
				+car2.speed+"km 입니다");
		car1.speedUp(100);
		car2.speedUp(100);
		System.out.println(car1.color+car1.model+"의 현재속도는 시속"
				+car1.speed+"km 입니다");
		System.out.println(car2.color+car2.model+"의 현재속도는 시속"
				+car2.speed+"km 입니다");
		car1.speedUp(100);
		car2.speedUp(100);
		System.out.println(car1.color+car1.model+"의 현재속도는 시속"
				+car1.speed+"km 입니다");
		System.out.println(car2.color+car2.model+"의 현재속도는 시속"
				+car2.speed+"km 입니다");
		car1.speedUp(100);
		car2.speedUp(100);
		System.out.println(car1.color+car1.model+"의 현재속도는 시속"
				+car1.speed+"km 입니다");
		System.out.println(car2.color+car2.model+"의 현재속도는 시속"
				+car2.speed+"km 입니다");
	}

}









