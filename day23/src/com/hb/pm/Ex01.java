package com.hb.pm;

class Target01 extends Thread{
	String name;
	
	@Override
	public void run() {
		int sum=0;
		System.out.println(name+":������ ����");
		for(int i=0; i<100; i++){
			System.out.println(name+">>>"+i+i+i);
		}
		System.out.println(name+":������ ����");
	}
}

public class Ex01{

	public static void main(String[] args) {
		// ������
		// ��Ƽ - ���μ���
		Target01 thr1 = new Target01();
		Target01 thr2 = new Target01();
		thr1.name="ù��°";
		thr2.name="�ι�°";
		thr1.start();
		thr2.start();
		
	}

}
