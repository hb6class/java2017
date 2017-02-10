package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable target = new Runnable(){
			@Override
			public void run() {
				System.out.println("1.쓰레드 실행");
				for(int i=0; i<100; i++){
					System.out.println("1.>>>"+i+i+i);
				}
				System.out.println("1.쓰레드 종료");
			}
		};
		Thread thr1=new Thread(target);
		Thread thr3=new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("2.쓰레드 실행");
				for(int i=0; i<100; i++){
					System.out.println("2.>>>"+i+i+i);
				}
				System.out.println("2.쓰레드 종료");
			}
		});
		thr1.start();
		thr3.start();
	}

}











