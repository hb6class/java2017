package com.hb.pm;

class Handle2 extends Thread{
	boolean boo;
	
	public Handle2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		while(true){			
			if(boo)Thread.yield();// Ȱ������ �������� ����� �ѱ��
			else System.out.println(this.getName());
		}
		
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Handle2 thr1 = new Handle2("��");
		Handle2 thr2 = new Handle2("��");
		thr1.start();
		thr2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thr2.boo=true;
	}

}
