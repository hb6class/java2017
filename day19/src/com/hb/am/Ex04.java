package com.hb.am;

class Utils2{
	
	static <T extends Number>int myCompare(T t,T m){
		// compare - same=0, > = 1, < = -1
		int x = t.intValue();
		int y = m.intValue();
		return Integer.compare(x, y);
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Utils2.myCompare(3.14, 10));
	}

}
