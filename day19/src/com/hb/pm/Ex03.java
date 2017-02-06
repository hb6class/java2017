package com.hb.pm;

class Test03 implements Cloneable{//clone()복사가능하다
	int num=1;
	int kor=90;
	int eng=80;
	int math=70;
	
	@Override
	public String toString() {
		String msg="[학번:"+num+",국어:"+kor+",영어:"+eng+",수학:"+math+"]";
		return msg;
	}
	
	Test03 copy(){
		Test03 obj=null;
		try {
			obj = (Test03)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test03 test1= new Test03();
		System.out.println(test1.toString());
		
		test1.math=100;
		System.out.println(test1.toString());
		Test03 test2=test1.copy();
		System.out.println("---------------------");
		test2.math=50;
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println("---------------------");
//		리플렉션
		Class clazz= test1.getClass();
		String name=clazz.getName();
		System.out.println(clazz.getSimpleName());
		Test03 test3=null;
		Test03 test4=null;
		Test03 test5=null;
		try {
//			Test03 test3=new Test03();
			Object obj=clazz.newInstance();//객체 생성
			test3=(Test03)obj;
			test3.num=2;
			
			Class<Test03> clzz2=Test03.class;
			test4=(Test03)clzz2.newInstance();
			test4.num=3;
			
			String url="com.hb.pm.Test03";
			Class<Test03> clzz3 = (Class<Test03>) Class.forName(url);
			test5=clzz3.newInstance();
			test5.num=4;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
		
	}

}











