package com.hb.pm;

class Car{	// �ڵ��� ��ü
	String color;	//�Ӽ���� - ���(~�̴�)
	String name;
	
	void run(){		//��ɿ�� - ����
		System.out.println("�޸���");
	}
	void stop(){
		System.out.println("�����");
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
