package com.hb.pm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
	ArrayList students = new ArrayList();
	static String[] st={"�й�","����","����","����","����"};
	
	private void showList() {
		// ����
		System.out.println("---------------------------------");
//		System.out.println("�й�\t����\t����\t����");
		for(int i=0; i<st.length; i++){
			System.out.print(st[i]);
			System.out.print("\t");
		}
		System.out.println("\n---------------------------------");
		for(int i=0; i<students.size(); i++){
			HashMap stu = (HashMap)students.get(i);
			for(int j=0; j<st.length; j++){
				System.out.print(stu.get(st[j]));
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	private void listAdd(int[] nums) {
		// �Է�
		HashMap stu = new HashMap();
		for(int i=0; i<st.length; i++){
			stu.put(st[i], nums[i]);
		}
		students.add(stu);
	}
	private void listEdit() {
		// ����
		
	}
	private void listDel() {
		// ����
		
	}

	public static void main(String[] args) {
		// �����������α׷� (ver 7.1.0)
		// �÷��� �����ӿ�ũ�� ����Ͽ� �ϼ�
		// �л� Ŭ���� ����
		// �л� - �й� ���� ���� ����
		Scanner sc = new Scanner(System.in);
		Ex05 me = new Ex05();
		System.out.println("�����������α׷� (ver 7.1.0)");
		int menu=0;
		while(true){
			System.out.print("1.���� 2.�Է� 3.���� 4.���� 0.����>");
			menu=sc.nextInt();
			if(menu==0){
				break;
			}
			switch (menu) {
			case 1:
				me.showList();
				break;
			case 2:
				int[] nums = new int[st.length];
				for(int i=0; i<nums.length; i++){
					System.out.print(st[i]+">");
					nums[i]=sc.nextInt();
				}
				me.listAdd(nums);
				break;
			case 3:
				me.listEdit();
				break;
			case 4:
				me.listDel();
				break;

			default:
				break;
			}
		}
	}

}












