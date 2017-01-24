package com.hb.am;

class Adder{
	int su;
	
	Adder add(int su){
		this.su+=su;
		return this;
	}
	int showSu(){
		return su;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Adder you = new Adder();
		int tot = you.add(1).add(2).add(3).add(4).add(5).showSu();
		System.out.println(tot);
		System.out.println("------------------------------");
		String st1 = "java";
		String st2 = " ";
		String st3 = "world";
		String st4 = st1+st2+st3;
		String st5 = st1.concat(st2).concat(st3).toString();
		System.out.println(st4);
		System.out.println(st5);
	}

}
