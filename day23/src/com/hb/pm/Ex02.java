package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thr1 = new Thread(){
			@Override
			public void run() {
				System.out.println("1.������ ����");
				for(int i=0; i<100; i++){
					System.out.println("1.>>>"+i+i+i);
				}
				System.out.println("1.������ ����");
			}
		};
		Thread thr2 = new Thread(){
			@Override
			public void run() {
				System.out.println("2.������ ����");
				for(int i=0; i<100; i++){
					System.out.println("2.>>>"+i+i+i);
				}
				System.out.println("2.������ ����");
			}
		};
		
		thr1.start();
		thr2.start();
	}

}
