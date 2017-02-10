package com.hb.pm;

class Target03 implements Runnable {

	@Override
	public void run() {
		System.out.println("1.쓰레드 실행");
		for(int i=0; i<100; i++){
			System.out.println("1.>>>"+i+i+i);
		}
		System.out.println("1.쓰레드 종료");
	}
	
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target03 tar3= new Target03();
		Thread thr1=new Thread(tar3);
		Thread thr3=new Thread(tar3);
		thr1.start();
		thr3.start();
	}

}











