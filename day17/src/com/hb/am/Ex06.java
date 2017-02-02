package com.hb.am;

abstract class Cl06{
	
	public Cl06() {
	}
	void func1() {}
	abstract void func2();
	
}
class Cl66 extends Cl06{
	@Override
	void func2() {}
}
interface Inter06{
	void func3();
}
public class Ex06 {

	public static void main(String[] args) {
		Inter06 inn = new Inter06(){
			@Override
			public void func3() {
				// TODO Auto-generated method stub
				
			}
		};
//		Cl06 me = new Cl06(){
//			@Override
//			void func2() {}
//		};
//		Cl66 me = new Cl66();
	}

}
