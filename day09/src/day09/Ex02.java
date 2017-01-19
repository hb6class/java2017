package day09;

public class Ex02 {

	public static void main(String[] args) {
		// 
		int a=100;
		int b=300;
		int c=500;
		int d=100;
		int e=300;
		int f=500;
		
		int[] arr1 = {a, b, c, d+10, e+10, f+10};
		arr1[3]=1000;
		for(int i=0; i<6; i++){
			System.out.println(arr1[i]);
		}
		System.out.println("-----------------------");
		// 1~10까지 중 짝수
		int[] arr2 = new int[5];
		for(int i=0; i<5; i++){
			arr2[i]=(i+1)*2;
		}
		
		for(int i=0; i<5; i++){
			System.out.print(arr2[i]+" ");
		}
		System.out.println("\n-----------------------");
		// 1~10까지 중 짝수
		int[] arr3 = new int[10];
		for(int i=0; i<10; i++){
			arr3[i]=i+1;
		}
//		for(int i=0; i<10; i++){
//			i++;
//			System.out.print(arr3[i]+" ");
//		}
//		for(int i=1; i<10; i+=2){
//			System.out.print(arr3[i]+" ");
//		}
		int[] arr4 = new int[5];
		for(int i=0; i<5; i++){
			arr4[i]=arr3[i*2+1];
		}
		for(int i=0; i<5; i++){
			System.out.println(arr4[i]);
		}
		System.out.println("\n-----------------------");
		int[] arr5 = new int[10];
		System.out.println("arr5의 배열 갯수:"+arr5.length);
		for(int i=0; i<10; i++){
			arr5[i]=i+1;
		} 
		System.out.println("arr5의 배열 갯수:"+arr5.length);
		System.out.println("\n-----------------------");
		int[] arr6 ={1,2,3,324,234,234,23423,42,32,23,42,4,423,4,24,24,24};
		System.out.println("arr6의 배열 갯수:"+arr6.length);
		System.out.println("\n-----------------------");
		char[] arr7= new char['Z'-'A'+1];
		for(int i=0; i<arr7.length; i++){
			arr7[i]=(char)(65+i);
		}
		for(int i=0; i<arr7.length; i++){
			System.out.print(arr7[i]+" ");
		}
		System.out.println("\n-----------------------");
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
//		**********
//		배열을 이용해서 출력하시오
//		{"*","**","***"}
//		String sum ="";
		String[] star = new String[10];
		star[0]="*";
		for(int i=0; i<star.length; i++){
//			sum+="*";
//			star[i]=star[i-1]+"*";
			String tmp="";
			for(int j=0; j<i+1; j++){
				tmp+="*";
			}
			star[i]=tmp;
		}
		for(int i=0; i<star.length; i++){
			System.out.println(star[i]);
		}
		
		System.out.println("\n-----------------------");
//		1
//		22		//21
//		333		//321
//		4444	//4321
		String[] sts = {"","","",""};
		int num=0;
//		for(int i=0; i<sts.length; i++){
//			num++;
//			String tmp2=""+num;
//			String sum2="";
//			for(int j=0; j<i+1; j++){
//				sum2=sum2+tmp2;
//			}
//			sts[i]=sum2;
//		}
		for(int i=0; i<sts.length; i++){
			num++;
			for(int j=0; j<i+1; j++){
				sts[i]+=num+"";
			}
		}
		System.out.println("\n-----------------------");
//		1		21		-> 1*1
//		22		311		-> 2*11
//		333		4111	-> 3*111
//		4444			-> 4*1111
		int[] arr11 = new int[4];
		int num3=0;
		for(int i=0; i<arr11.length; i++){
			int su1=1;
			num3=0;
			for(int j=0; j<i+1; j++){
				num3+=su1*1;
				su1*=10;				
			}
			arr11[i]=(i+1)*num3;
		}
		
		for(int i=0; i<arr11.length; i++){
			System.out.println(arr11[i]);
		}
		System.out.println("\n-----------------------");
//		1
//		11
//		111
//		1111
		
		
	}

}


























