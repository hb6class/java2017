package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// 
		int[] arr1 = new int[5];
		arr1[0]=5;
		arr1[1]=25;
		arr1[2]=1;
		arr1[3]=41;
		arr1[4]=31;
		// �迭����(��������-shallow Copy)
		//int[] arr2=arr1;
		// �迭����(��������-Deep Copy)
//		int[] arr2= new int[5];
//		int[] arr2= new int[]{0,0,0,0,0};
		int[] arr2= {0,0,0,0,0};
		for(int i=0; i<arr2.length; i++){
			arr2[i]=arr1[i];
		}
		
		// ��Ʈ
		int tmp=0;
		for(int j=0; j<arr2.length-1; j++){
			for(int i=j; i<arr2.length; i++){
				if(arr1[j]>arr1[i]){
					tmp=arr1[j];
					arr1[j]=arr1[i];
					arr1[i]=tmp;
				}
			}
		}
		// ���
		System.out.println("arr1�� ����");
		for(int i=0; i<arr1.length; i++){
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("arr2�� ����");
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
	}

}
