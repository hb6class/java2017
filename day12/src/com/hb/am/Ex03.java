package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		Ex03 me = new Ex03();
		System.out.println(me.plus(2));
		System.out.println(me.plus(4));
		System.out.println(me.plus(16));
		System.out.println("-----------------------");
		System.out.println(me.plus(2));
		System.out.println(me.plus(me.plus(2)));
		System.out.println(me.plus(me.plus(me.plus(2))));
		System.out.println("-----------------------");
		me.func01();
		me.func01();
		me.func01();
		System.out.println("-----------------------");
		me.func02().func02().func02();
	}
	
	public void func04(){
		this.func03();
	}
	public void func03(){
		System.out.println("func03()");
	}
	
	public Ex03 func02(){
		System.out.println("func02() 실행");
		return this;
	}
	
	public void func01(){
		System.out.println("func01() 실행");
	}
	
	public int plus(int su){
		su*=su;
		return su;
	}

}
