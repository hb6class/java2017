package com.hb.pm;

import java.util.Scanner;

public class Ex01 {
	public static Scanner sc;

	public static void main(String[] args) {
		// bbs
		// 1.�۸�� 2.�۾��� 3.�ۺ��� 4.�ۼ��� 0.����
		// 1. �۹�ȣ ����
		//    ---------------
		//    1		 ����1
		//    2		 -
		//    3		 -
		//    ~
		//    10	 ����10
		// 2. 	������:
		//		�۾���:
		//		����:
		// 3. �۹�ȣ>2
		//    	������: ����2
		//		�۾���:	guest
		//		��  ��:	aaaaaa
		// 3. ������ ��ȣ>2
		//    	������: ����22
		//		�۾���:����������
		//		����:����������
		sc = new Scanner(System.in);
		System.out.println("BBS �Խ��� ver 2.0.0");
//		String[] record = new String[]{"����","�۾���","����"};
		String[][] records = new String[10][];
		for(int i=0; i<records.length; i++){
			records[i]=new String[]{"-","",""};
		}
		String input1="";
		int cnt=0;
		while(true){
			System.out.print("1.�۸�� 2.�۾��� 3.�ۺ��� 4.�ۼ��� 0.����>");
			input1=sc.nextLine();
			if(input1.equals("1")){
				System.out.println("-------------------------");
				System.out.println("�۹�ȣ\t����");
				System.out.println("-------------------------");
				for(int i=0; i<records.length; i++){
					System.out.println(i+1+"\t"+records[i][0]);
				}
				System.out.println("-------------------------\n");
			}else if(input1.equals("2")){
//				System.out.print("��  ��:");
//				String inp1=sc.nextLine();
//				System.out.print("�۾���:");
//				String inp2=sc.nextLine();
//				System.out.print("��  ��:");
//				String inp3=sc.nextLine();
//				System.out.println();
//				records[cnt]=new String[]{inp1,inp2,inp3};
				input(records,cnt);
				cnt++;
			}else if(input1.equals("3")){
				System.out.print("�۹�ȣ ����>");
				input1 = sc.nextLine();
				int num = Integer.parseInt(input1);
				System.out.println("��  ��:"+records[num-1][0]);
				System.out.println("�۾���:"+records[num-1][1]);
				System.out.println("��  ��:"+records[num-1][2]);
				System.out.println("\n");
			}else if(input1.equals("4")){
				System.out.print("�۹�ȣ ����>");
				input1 = sc.nextLine();
				int num = Integer.parseInt(input1);
//				System.out.print("��  ��:");
//				String inp1=sc.nextLine();
//				System.out.print("�۾���:");
//				String inp2=sc.nextLine();
//				System.out.print("��  ��:");
//				String inp3=sc.nextLine();
//				records[num-1] = new String[]{inp1,inp2,inp3};
				input(records,num-1);
				System.out.println();
			}else if(input1.equals("0")){
				System.out.println("\n\n�����մϴ�\n");
				break;
			}
		}
	}
	
	public static void input(String[][] records,int num){
		String[] subs={"��  ��:","�۾���:","��  ��:"};
		for(int i=0; i<subs.length; i++){
			subs[i]=func01(subs[i]);
		}
		records[num] = new String[]{subs[0],subs[1],subs[2]};
	}
	public static String func01(String st1){
		System.out.print(st1);
		String inp1=sc.nextLine();
		return inp1;
	}

}















