package com.hb.am;

public class Ex02 {
	public int max;
	public int speed;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 car1 = new Ex02();
		Ex02 car2 = new Ex02();
		car1.max=80;
		car2.max=150;
		System.out.println(car1.speed+","+car2.speed);
		car1.speedUp(50);
		car2.speedUp(50);
		System.out.println(car1.speed+","+car2.speed);
		car1.speedUp(50);
		car2.speedUp(50);
		System.out.println(car1.speed+","+car2.speed);
		car1.speedUp(50);
		car2.speedUp(50);
		System.out.println(car1.speed+","+car2.speed);
	}
	
	public void speedUp(int up){
		if(speed+up<=max){
			speed+=up;
		}else{
			speed=max;
		}
	}
	public void speedDown(int down){
		if(speed-down>=0){
			speed-=down;
		}else{
			speed=0;
		}
	}
}
