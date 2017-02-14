package com.hb.am;

class Temp01 extends Thread{
	int time=10;
	
	public int getTime() {
		if(time==0)return 0;
		return time--;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int cnt=getTime();
			System.out.println(cnt+"√ ");
			if(cnt==0)break;
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Temp01 tmp = new Temp01();
		tmp.start();

	}

}
