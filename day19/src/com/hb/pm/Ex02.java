package com.hb.pm;

class Test2{
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "내가 만든 객체";
//	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1234;
	}
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Test2){
				return this.hashCode()==obj.hashCode();
			}
			return false;
		}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test1= new Test2();
		Test2 test2= new Test2();
		Test2 test3= test1;
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		System.out.println(test3.hashCode());
		System.out.println(test1.equals(test2));
	}

}
