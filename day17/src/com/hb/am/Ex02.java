package com.hb.am;

public class Ex02 {
	int num=3;
	int num2=num;
	static int num3=300;
	
	
	class Cl02{
		int cnum11=1000+num;
		static final int cnum12=2000;
		// 내부클래스의 필드중, static경우는 상수형변수만 허용
		
		static final String msg="내부클래스의 필드";
		
		void func01(){
			System.out.println("내부클래스의 func01()");
		}
	}
	
	static class Cl22{ 
		static int cnum22=22;
		int cnum23=23;
		public Cl22() {
			// TODO Auto-generated constructor stub
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me1 = new Ex02();
		System.out.println(me1.num);
		
//		Cl02 cl1= new Cl02();
//		System.out.println(me1.Cl02.msg);
		Cl02 cl1= me1.new Cl02();
		cl1.func01();
//		System.out.println(cl1.cnum1);
//		System.out.println(cl1.msg);
		
		System.out.println(num3);
		System.out.println(Ex02.Cl22.cnum22);
		Cl22 cl22 = new Ex02.Cl22();
		System.out.println(cl22.cnum23);
	}

}
