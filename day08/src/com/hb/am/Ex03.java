package com.hb.am;

class Car{
	// ��ü - �Ӽ�, ���
	int max=0;//�Ӽ�
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
	void speedUp(int up){ // ��ɿ��
		if(speed+up<=max){
			speed+=up;
			}else{
				speed=max;
			}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Car car1 = new Car(); // �ҳ�Ÿ
		car1.company="����";
		car1.model="�ҳ�Ÿ";
		car1.color="������";
		
		Car car2 = new Car(); // ���
		car2.company="���";
		car2.model="���";
		car2.color="��ũ��";
		
		car1.setMax(250);
		car2.setMax(180);
		
		System.out.println(car1.color+car1.model+"�� ����ӵ��� �ü�"
				+car1.speed+"km �Դϴ�");
		System.out.println(car2.color+car2.model+"�� ����ӵ��� �ü�"
				+car2.speed+"km �Դϴ�");
		car1.speedUp(100);
		car2.speedUp(100);
		System.out.println(car1.color+car1.model+"�� ����ӵ��� �ü�"
				+car1.speed+"km �Դϴ�");
		System.out.println(car2.color+car2.model+"�� ����ӵ��� �ü�"
				+car2.speed+"km �Դϴ�");
		car1.speedUp(100);
		car2.speedUp(100);
		System.out.println(car1.color+car1.model+"�� ����ӵ��� �ü�"
				+car1.speed+"km �Դϴ�");
		System.out.println(car2.color+car2.model+"�� ����ӵ��� �ü�"
				+car2.speed+"km �Դϴ�");
		car1.speedUp(100);
		car2.speedUp(100);
		System.out.println(car1.color+car1.model+"�� ����ӵ��� �ü�"
				+car1.speed+"km �Դϴ�");
		System.out.println(car2.color+car2.model+"�� ����ӵ��� �ü�"
				+car2.speed+"km �Դϴ�");
	}

}









