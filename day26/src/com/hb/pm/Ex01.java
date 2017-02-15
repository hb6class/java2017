package com.hb.pm;

class Target{
	int cnt;

	public int func() {
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
			int cnt=0;
			while(cnt<20){
				this.notify();// ��� �� �ϳ� ����
//				this.notifyAll();// ��� ���� �����带 ��� ����
				
				Thread _this = Thread.currentThread();
				cnt=target.func();
				System.out.println(_this.getName()+":run-"+cnt);
				try {
					Thread.sleep(500);
					this.wait();// �ڽ��� �����带 ���
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
