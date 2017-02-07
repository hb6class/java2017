package com.hb.am;

import java.util.Arrays;
import java.util.Objects;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 1000;
		Integer num2 = 1000;
		Integer num3 = null;
		
		System.out.println(num1==num2);
		System.out.println(num1.equals(num2));
		System.out.println(Objects.equals(num1, num2));
		System.out.println(Objects.equals(num1, num3));
		System.out.println(Objects.equals(null, num3));
		System.out.println("------------------------------");
		Integer[] arr1={1,2};
		Integer[] arr2={1,2};
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println(Objects.equals(arr1, arr2));
		boolean result=true;
		for(int i=0; i<arr1.length; i++){
			if(arr1.length!=arr2.length||!(arr1[i].equals(arr2[i]))){
				result=false;
				break;
			}
		}
		System.out.println(result);
		System.out.println("------------------------------");
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr2));
		int[] lotto = {44, 32, 11, 20, 33, 2};
		
		Arrays.sort(lotto);
		
//		for(int i=0; i<lotto.length; i++){
//			lotto[i]++;
//			System.out.print(lotto[i]+" ");
//		}
//		System.out.println();
//		개선된 루프문 (for each문, for in문)
		for(int tmp : lotto){
			System.out.print(tmp +" ");
		}
		System.out.println();
	}

}



















