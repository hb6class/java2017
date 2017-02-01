package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// 예외처리
		// 오류
		// 에러
		char[] ch = {'a','b','c','d','e'};
		
		for(int i=0; i<=10; i++){
			
			try{//시도
				System.out.println(ch[i]);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}

	}

}
