package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
//		int[] arr2=arr1;
		
		boolean result=true;
		int i=0;
		while(result){
			if(arr1[i]!=arr2[i]||arr1.length!=arr2.length){
				result=false;
			}
			if(i==arr1.length-1){
				break;
			}
			i++;
		}
		
		if(result){
			System.out.println("두 배열이 같다");
		}else{
			System.out.println("두 배열이 다르다");			
		}
	}

}
