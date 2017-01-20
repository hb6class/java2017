package com.hb.am;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr1 = new int[]{1,2,3,4};
//		int[] arr2 = {10,20,30,40};
//		int[] arr3 = {11,22,33,44};
//		
////		int[][] arrs=new int[][]{arr1,arr2,arr3};
////		int[][] arrs={arr1,arr2,arr3};
//		int[][] arrs={
//						{1,2,3,4},
//						{10,20,30,40},
//						{11,22,33,44}
//					};
		
		int[][] arrs = new int[3][];
		arrs[0]=new int[]{15,25,35,45};
		arrs[1]=new int[]{10,20};
		arrs[2]=new int[]{11,22,33,44};
		
		
		for(int m=0; m<arrs.length; m++){
			for(int n=0; n<arrs[m].length; n++){
				System.out.print(arrs[m][n]+" ");
			}
			System.out.println();
		}
		
	}

}







