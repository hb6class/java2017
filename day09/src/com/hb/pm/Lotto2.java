package com.hb.pm;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(int)(Math.random()*45)+1;
		int[] lotto = new int[6];
		// �ߺ��˻�
		for(int i=0; i<lotto.length; i++){
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(lotto[i]==lotto[j]){
					System.out.println(i+1+"��°����"+(j+1)+"��° ����"
										+lotto[i]+"���� �ߺ��߻� �ٽû���");
					i--;
					break;
				}
			}
		}
		// ��Ʈ(��������)
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
