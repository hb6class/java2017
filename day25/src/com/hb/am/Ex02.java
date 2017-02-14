package com.hb.am;

class Temp2 extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("Temp2 working");
		}
	}
}

class Temp22 extends Thread{
	
	@Override
	public void run() {
		Temp2 thr2= new Temp2();
		thr2.start();
		synchronized (this) {
			try {
				sleep(1000);
				thr2.wait();
				sleep(5000);
//				thr2.notify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex02 {
	// wait(); ÁßÁö , notify();±ú¿ò  -synchronized

	public static void main(String[] args) {
		Temp22 tmp1= new Temp22();
		tmp1.start();

	}

}
