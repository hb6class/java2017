package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// {1995,1996,1997,1998,1999}
		// {1994,1995,1996,1997,1998,1999,2000}
		// 
		
		int[] arr1= new int[5];
		
		for(int i=0; i<arr1.length; i++){
			arr1[i]=1995+i;
		}
		
		int[] arr2 = new int[7];
		System.arraycopy(arr1, 0, arr2, 1, 5);
//		for(int i=0; i<arr1.length; i++){
//			arr2[i+1]=arr1[i];
//		}
		arr2[0]=1994;
		arr2[6]=2000;
		
		
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}

	}

}
