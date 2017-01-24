package com.hb.am;

class Car{
	private String name;
	private int speed;
	private int max;//정보의 은닉성
	public Car(String name) {
		this.name=name;
		if(name.equals("모닝")){
			max=80;
		}else if(name.equals("소나타")){
			max=150;
		}else if(name.equals("그렌져")){
			max=200;
		}
	}
	void tuning(int max){// 캡슐화
		this.max=max;
	}
	void speedUp(int speed){
		if(this.speed+speed>max){
			this.speed=max;
		}else{
			this.speed+=speed;
		}
	}
	int showSpeed(){
		return speed;
	}
	String showName(){
		return name;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car("모닝");
//		car1.max=180;
		car1.tuning(180);
//		car2.max=150;
		System.out.println("내차인 "+car1.showName()+"은 현재속도:"+car1.showSpeed());
//		car1.speed+=50;
		car1.speedUp(50);
		System.out.println("내차인 "+car1.showName()+"은 현재속도:"+car1.showSpeed());
		car1.speedUp(50);
		System.out.println("내차인 "+car1.showName()+"은 현재속도:"+car1.showSpeed());
		car1.speedUp(50);
		System.out.println("내차인 "+car1.showName()+"은 현재속도:"+car1.showSpeed());
		car1.speedUp(50);
//		car1.speed=50;
		System.out.println("내차인 "+car1.showName()+"은 현재속도:"+car1.showSpeed());
		
	}

}
