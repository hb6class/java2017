package com.hb.am;

interface Inter04{
//	interface 인터페이스명{}
	final int num1=100;// 필드- 상수형 변수
	int num2=200;// 필드- 상수형 변수
//	public static int num3=300;// 필드- 상수형 변수
//	int a; 필드 존재x
//	Inter04(){}// 생성자 존재x
	public abstract void num1();
	public void num2();
	abstract void num3();
	void num4();
//	public void num4(){}
}


interface Inter444{
	void func02();
}
interface Inter44 extends Inter04, Inter444{
	int num3=444;
	void func01();
}

public class Ex04 implements Inter44{

	public static void main(String[] args) {
		// 인터페이스
		Ex04 me1 = new Ex04();
		Inter44 me3 = new Ex04();
		
		Inter04 me2 = new Ex04();
		
		Inter444 me4 = new Ex04();
		me4.func02();
	}

	@Override
	public void num1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void num2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void num3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void num4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}


}
