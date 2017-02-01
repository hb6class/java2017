package com.hb.am;

abstract class Ex33{
	public abstract void func01();
	protected abstract void func02();
	abstract void func03();
//	private abstract void func04();
	private void func05(){}
}

public class Ex03 extends Ex33 {
	@Override
	public void func01() {}
	@Override
	protected void func02() {}
	@Override
	void func03() {}
//	@Override
//	private void func05() {}
	
	public static void main(String[] args) {
		
	}
}
