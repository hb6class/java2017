package com.hb.pm;

public class Ex06 {
	public int max;
	public int speed;	// 맴버필드 (전역변수)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		Ex06 me = new Ex06();
		me.max=150;
		System.out.println(me.speed);
		me.speedUp(50);
		System.out.println(me.speed);
		me.speedUp(50);
		System.out.println(me.speed);
		me.speedUp(60);
		System.out.println(me.speed);
		me.speedDown(60);
		System.out.println(me.speed);
		me.speedDown(60);
		System.out.println(me.speed);
		me.speedDown(60);
		System.out.println(me.speed);
	}
	
	public void speedUp(int up){
		if(speed+up>max){
			speed=max;
			return;
		}
		speed+=up;
	}
	public void speedDown(int down){
		if(speed-down<0){
			speed=0;
			return;
		}
		speed-=down;
	}
}
