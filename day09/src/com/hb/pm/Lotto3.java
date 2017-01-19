package com.hb.pm;

public class Lotto3 {

	public static void main(String[] args) {
		// 
		int[] lotto = new int[45];
		for(int i=0; i<lotto.length; i++){
			lotto[i]=i+1;
		}
		int tmp=0;
		for(int i=0; i<10000; i++){
			tmp=lotto[0];
			int ran=(int)(Math.random()*44)+1;
			lotto[0]=lotto[ran];
			lotto[ran]=tmp;
		}
				
		for(int i=0; i<6; i++){
			System.out.print(lotto[i]+" ");
		}
	}

}
