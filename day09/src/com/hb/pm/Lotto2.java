package com.hb.pm;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(int)(Math.random()*45)+1;
		int[] lotto = new int[6];
		// 중복검사
		for(int i=0; i<lotto.length; i++){
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					System.out.println(i+1+"번째공이"+(j+1)+"번째 공과"
										+lotto[i]+"으로 중복발생 다시뽑음");
					i--;
					break;
				}
			}
		}
		// 소트(오름차순)
		int tmp=0;
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
		System.out.println();
	}

}
