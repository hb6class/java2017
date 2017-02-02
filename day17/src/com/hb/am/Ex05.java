package com.hb.am;

interface Inter{
	void func04();
}

class Outter3{
	static int a1=11;
	int a2=12;
	public Outter3() {
		System.out.println("Outter3");
	}
	public int func1() {
//		int a=100;
//		return a;
		return 100;
	}
	
	public void func2() {
		Inter local=func3();
		System.out.println("---------------------");
		local.func04();
	}
	
	public Inter func3() {
//		int temp=3;		// 1.7(x) 1.8(o)
//		final int temp=3;		// 1.7(x) 1.8(o)
		return new Inter(){
			@Override
			public void func04() {
				System.out.println("로컬 영역의 클래스 내부 메소드 실행");
			}
		};
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		Outter3 outt = new Outter3();
		outt.func2();
	}

}
