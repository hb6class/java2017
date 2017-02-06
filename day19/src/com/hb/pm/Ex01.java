package com.hb.pm;

class Test11 extends Object{
	int serial = 12345;
	int value=12;

	public Test11(int serial) {
		this.serial=serial;
	}
	@Override
	public boolean equals(Object obj) {
//		return this.serial==((Test11)obj).serial;
		if(obj instanceof Test11){
			return true;
		}
		return false;
	}
}

class Test01 extends Object{
	int serial = 12345;
	
	public Test01() {
	}
	public Test01(int serial) {
		this.serial=serial;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Test01){
			boolean result=this.serial==((Test01)obj).serial;
			return result;
		}
		return false;
	}
}

public class Ex01 extends Object {

	public static void main(String[] args) {
		// 그밖의 클래스
//		Ex01 me = new Ex01();
		String st1 ="java";
		String st2 = st1;
		System.out.println(st1==st2);
		String st3 = new String("java");
		String st4 = new String("java");
		System.out.println("==비교:"+(st3==st4));
		System.out.println("equals():"+st3.equals(st4));
		System.out.println("===================================");
		Object test1= new Test01();
		Object test2= new Test01();
		Object test3= new Test01(11111);
		Object test4= new Test11(11111);
//		System.out.println("==비교:"+(test1==test2));
		// 동일타입(동일자료형 검사)의 경우는 true;
		System.out.println("equals():"+test1.equals(test2));
		System.out.println("equals():"+test1.equals(test3));
		System.out.println("equals():"+test3.equals(test4));
//		System.out.println(test1 instanceof Test01);
//		System.out.println(test3 instanceof Test11);
//		System.out.println(test4 instanceof Test11);
		

	}

}
