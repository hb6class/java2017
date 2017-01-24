package com.hb.am;

class Ex06 {
	// 접근제한자
	// class > 생성자,필드,메소드
	
	public Ex06() {
	}
	Ex06(int a){
		
	}
	private Ex06(int a, int b){
		
	}
	
	public int a=1;
	int b=2;
	private int c=3;
	
	public void func01(){
		System.out.println("func01() run");
	}
	void func02(){
		System.out.println("func02() run");
	}
	private void func03(){
		System.out.println("func03() run");
	}
}
