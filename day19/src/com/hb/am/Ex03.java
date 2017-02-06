package com.hb.am;

class Car{}

class Air{}
class Navi{}


class Factory<T>{
	T obj;
	void setObj(T obj){
		this.obj=obj;
	}
	T getObj(){
		return obj;
	}
}

class Utils{
	static <T>Factory<T> getInst(T t){
		Factory<T> fac=new Factory<T>();
		fac.setObj(t);
		return fac;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Factory<Integer> fac1 = Utils.getInst(1234);
		int st = fac1.getObj();
		System.out.println(st);
	}

}








