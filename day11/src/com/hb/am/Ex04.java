package com.hb.am;

class Ex44{}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex44 ex1= new Ex44();
		Ex44 ex2= new Ex44();
		Ex44 ex3= new Ex44();
		Ex44 ex4= new Ex44();
		Ex44[] exs= {ex1,ex2,ex3,ex4};
		exs= new Ex44[]{ex1,ex2,ex3,ex4};
		
		
//		exs[0]=new Ex44();
//		exs[1]=ex2;
//		exs[2]=null;
//		exs[3]=new Ex44();
		
		
//		int[][] arrs = null;
//				arrs= new int[][]{
//										{0,0,0}
//										,{0,0,0}
//										,{0,0,0}
//										,{0,0,0}
//									};
		int[][]	arrs= {
						new int[]{0,0,0}
						,new int[]{0,0,0}
						,new int[]{0,0,0}
						,new int[]{0,0,0}
						};
		arrs[0] = new int[]{1,2,3};// int a1=0; a2=0; a3=0;
		arrs[1] = new int[]{4,5};
		arrs[2] = new int[]{7,8,9};
		arrs[3] = new int[3];
//		for(int m=0; m<arrs.length; m++){
//			arrs[m]=new int[3];
//		}
		
		for(int m=0; m<arrs.length; m++){
			for(int n=0; n<arrs[m].length; n++){
				System.out.print(arrs[m][n]+" ");
			}
			System.out.println();
		}
	}

}
