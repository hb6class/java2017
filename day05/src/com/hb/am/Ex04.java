package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// 메소드를 활용해서 아래를 출력하시오
		// *
		// **
		// ***
		// ****
		star(4);
		
	}//main end
	
	public static void star(int a){
		for(int i=0; i<a; i++){
			for(int j=0; j<i+1; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
	}//star end
}//class end
