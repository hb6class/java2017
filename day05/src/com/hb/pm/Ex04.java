package com.hb.pm;

public class Ex04 {

	
	public static void main(String[] args) {
		// �л� �������α׷�
		// ���� 90 ����70 ����60
		// �հ� ��� ����(A~F)
		String input1 = args[0];
		String input2 = args[1];
		String input3 = args[2];
				
		int kor=Integer.parseInt(input1);
		int eng=Integer.parseInt(input2);
		int math=Integer.parseInt(input3);
		System.out.println("-----------------------------------------------");
		System.out.println("����\t����\t����\t�հ�\t���\t����");
		System.out.println("-----------------------------------------------");
			prnt(kor,eng,math);
	}
	public static char res(double avg){
		char ch='F';
		switch ((int)(avg/10)) {
			case 10:
			case 9: ch='A'; break;
			case 8: ch='B'; break;
			case 7: ch='C'; break;
			case 6: ch='D'; break;
			default: break;
		}
		return ch;
	}
	
	public static void prnt(int kor, int eng, int math){
		int sum=sum(kor,eng,math);
		double avg=avg(sum);
		
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+sum(kor,eng,math)
									+"\t"+avg+"\t"+res(avg));
		System.out.println("-----------------------------------------------");
	}
	public static int sum(int kor, int eng, int math){
		int sum=kor+eng+math;
		return sum;
	}
	public static double avg(int sum){
		double avg=sum*100/3/100.0;
		return avg;
	}
}











