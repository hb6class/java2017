package com.hb.pm;

class Handle2 implements Runnable{
	Target target;
	boolean boo;
		
	public Handle2(Target target) {
		this.target=target;
	}
	
	@Override
	public void run() {
		Thread _this = Thread.currentThread();
		int cnt =0;
		
		while(true){			
			if(boo)Thread.yield();// 활동중인 스레드중 제어권 넘기기
			System.out.println(_this.getName());
		}
		
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		Target target = new Target();
		Handle2 han = new Handle2(target);
		Handle2 han2 = new Handle2(target);
		Thread thr1 = new Thread(han);
		Thread thr2 = new Thread(han2);
		thr1.start();
		thr2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		han2.boo=true;
	}

}
