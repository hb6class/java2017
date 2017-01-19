package day09;

public class Ex03 {

	public static void main(String[] args) {
//		1
//		11
//		111
//		1111
		int[] arr1= new int[4];
		int num1, num2;
		num1=0; //´©Àû
		num2=1; //ÀÚ¸´¼ö
		for(int m=0; m<4; m++){
			num1=0;
			num2=1;
			for(int n=0; n<m+1; n++){
				num1+=1*num2;
				num2*=10;
			}
			arr1[m]=num1*(m+1);
		}
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}

	}

}
