package com.hb.pm;

class Son01{
	protected int num=1000;// default-동일패키지 내부에서만 접근 허용
	final int num2=111;
}

public class Ex01 extends Son01 {

	public static void main(String[] args) {
		// 접근제한자
		// public 
		// protected - 상속의 경우에만 접근허용
		// default
		// private
//		public > protected > default > private
		
//		com.hb.am.Ex06 me06 = new com.hb.am.Ex06();
//		System.out.println(me06.num);
//		me06.func01();
//		me06.func02();
		Ex01 me = new Ex01();
		System.out.println(me.num);
		System.out.println(me.num2);
		me.num=10;
//		me.num2=10;
		System.out.println(me.num);
		System.out.println(me.num2);
		
//		me.func02();
	}

}
