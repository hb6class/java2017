package com.hb.pm;

class Target01 extends Thread{
	String name;
	
	@Override
	public void run() {
		int sum=0;
		System.out.println(name+":쓰레드 실행");
		for(int i=0; i<100; i++){
			System.out.println(name+">>>"+i+i+i);
		}
		System.out.println(name+":쓰레드 종료");
	}
}

public class Ex01{

	public static void main(String[] args) {
		// 쓰레드
		// 멀티 - 프로세스
		Target01 thr1 = new Target01();
		Target01 thr2 = new Target01();
		thr1.name="첫번째";
		thr2.name="두번째";
		thr1.start();
		thr2.start();
		
	}

}
