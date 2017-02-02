package com.hb.am;

class Outter2{
	static int a1=11;
	static int a2=12;
	static void func01(){
		System.out.println("Outter-func01()");
	}
	public Outter2() {
		System.out.println("Outter create");
	}
	int a3=13;
	void func02(){
		System.out.println("Outter-non.func02()");		
	}
	class Inner2{
		static final int b1=21;
//		static int b1=21;
//		static void func01(){
//			System.out.println("Inner-func01()");
//		}
		public Inner2() {
			System.out.println("Inner create");
		}
		int b2=22;
		void func02(){
			System.out.println("Inner-non.func02()"+a3);
		}
	}
}



public class Ex04 {

	public static void main(String[] args) {
		Outter2 outt=new Outter2();
//		Outter2.Inner2 inn=outt.(new Inner2());
		Outter2.Inner2 inn=outt.new Inner2();
		inn.func02();
		System.out.println(inn.b2);
		outt.func02();
	}

}
