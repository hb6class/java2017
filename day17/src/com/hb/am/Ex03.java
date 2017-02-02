package com.hb.am;

class Outter{
	static int a1=10;
	static int a11=Inner.b1;
	int a2=20;

	static class Inner{
		static int b1=200;
		int b2=200;
		public Inner() {
			System.out.println("Inner() create");			
		}
		public void func01(){
			System.out.println("Inner-func01()");
		}
		public static void func02(){
			System.out.println("Inner-func02()");
		}
	}
	
	public Outter() {
		System.out.println("Outter() create");		
		
	}
	
	public void func01() {
		System.out.println("Outter-func01()"+Inner.b1);
		Inner.func02();
		Inner inn=new Inner();
//		Outter.Inner inn=new Outter.Inner();
		inn.func01();
		System.out.println(inn.b2);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter.Inner.func02();
		System.out.println(Outter.Inner.b1);
		Outter.Inner inn=new Outter.Inner();
		System.out.println(inn.b2);
		inn.func01();
	}

}
