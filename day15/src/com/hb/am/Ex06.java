package com.hb.am;

class Ex06 {	// (x) private, protected 
	protected int num=1000;// default-동일패키지 내부에서만 접근 허용
	
	public Ex06() {
		// TODO Auto-generated constructor stub
	}
	
	void func01(){
		System.out.println(num);
	}
	protected void func02(){
		System.out.println(num);
	}
}
