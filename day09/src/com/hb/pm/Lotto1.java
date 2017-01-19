package com.hb.pm;

public class Lotto1 {

	public static void main(String[] args) {
		// 1. 1 ~ 45까지의 랜덤수 
		// 2. 랜덤수 중복불가
		// 3. 정렬(오름차순)
		int tmp=0;
		int[] lotto ={3,25,10,33,42};
		
		for(int i=0; i<lotto.length; i++){
			for(int j=i+1; j<lotto.length; j++){
				if(lotto[i]>lotto[j]){
					tmp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i]+" ");
		}
		
	}

}
