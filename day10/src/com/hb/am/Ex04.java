package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5, 3, 8, 6, 1};
		
		int[] arr3 = sort(arr1);
		
		System.out.println("arr3:");
		for(int i=0; i<arr3.length; i++){
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] sort(int[] arr2){
//		int[] arr2=arr1;
		int tmp=0;
		for(int m=0; m<arr2.length-1; m++){
			for(int n=m+1; n<arr2.length; n++){
				if(arr2[m]>arr2[n]){
					tmp=arr2[m];
					arr2[m]=arr2[n];
					arr2[n]=tmp;
				}
			}
		}
		return arr2;
	}

}
