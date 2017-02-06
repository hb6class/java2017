package com.hb.am;

interface Writing{
	String getColor();
}

class Pencil implements Writing{
	String color="red";

	@Override
	public String getColor() {
		return color;
	}	
	
}

class Pen implements Writing{
	String color="pink";

	@Override
	public String getColor() {
		return color;
	}
}

class Box2<T>{	// T,K,V,E,U,....
	T obj;
	void setObj(T obj){
		this.obj=obj;
	}
	T getObj(){
		return obj;
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// 
//		Box2 box = new Box2();
//
//		box.setObj(new Pen());
//		Pen pen1 = (Pen)box.getObj();
//		System.out.println(pen1.color);
//		
//		box.setObj("pen");
//		Pen pen2 = (Pen)box.getObj();
//		System.out.println(pen2.color);
		
		Box2<Writing> box = new Box2<Writing>();
		
		box.setObj(new Pen());
		Writing pen1 = box.getObj();
		System.out.println(pen1.getColor());
		
		box.setObj(new Pencil());
		Writing pen2 = box.getObj();
		System.out.println(pen2.getColor());
		
	}

}











