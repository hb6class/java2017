package com.hb.am;

abstract class ����{
	int ����=10;
	void func(){
		draw();
	}
	abstract void draw();
}

class �簢�� extends ����{
	@Override
	void draw() {
		System.out.println("���̰� "+����+"cm�� �簢���� �׸���");
	}
}

class �� extends ���� {
	@Override
	void draw() {
		System.out.println("������ " +����+"cm�� ���� �׸���");
	}
}

public class Ex02 {

	public static void main(String[] args) {
//		�� obj1 = new ��();
//		obj1.draw();
//		�簢�� obj2 = new �簢��();
//		obj2.draw();
		���� obj3 = new ��();
		obj3.draw();
		obj3 = new �簢��();
		obj3.draw();
		
	}

}













