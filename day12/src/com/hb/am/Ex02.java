package com.hb.am;

class Car{
	private String name;
	private int speed;
	private int max;//������ ���м�
	public Car(String name) {
		this.name=name;
		if(name.equals("���")){
			max=80;
		}else if(name.equals("�ҳ�Ÿ")){
			max=150;
		}else if(name.equals("�׷���")){
			max=200;
		}
	}
	void tuning(int max){// ĸ��ȭ
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
		Car car1= new Car("���");
//		car1.max=180;
		car1.tuning(180);
//		car2.max=150;
		System.out.println("������ "+car1.showName()+"�� ����ӵ�:"+car1.showSpeed());
//		car1.speed+=50;
		car1.speedUp(50);
		System.out.println("������ "+car1.showName()+"�� ����ӵ�:"+car1.showSpeed());
		car1.speedUp(50);
		System.out.println("������ "+car1.showName()+"�� ����ӵ�:"+car1.showSpeed());
		car1.speedUp(50);
		System.out.println("������ "+car1.showName()+"�� ����ӵ�:"+car1.showSpeed());
		car1.speedUp(50);
//		car1.speed=50;
		System.out.println("������ "+car1.showName()+"�� ����ӵ�:"+car1.showSpeed());
		
	}

}
