package com.hb.pm;

class Target{
	int cnt;

	private int func() {
		cnt++;
		return cnt;
	}
	
}

class Handle implements Runnable{
	Target target;
	public Handle(Target target) {
		this.target=target;
	}

	@Override
	public void run() {
		synchronized(this){
			while(true){
				this.notify();
				Thread _this = Thread.currentThread();
				System.out.println(_this.getName()+":run");
				try {
					Thread.sleep(500);
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		Target obj = new Target();
		Handle hand = new Handle(obj);
		Thread thr1= new Thread(hand);
		Thread thr2= new Thread(hand);
		thr1.start();
		thr2.start();
	}

}
