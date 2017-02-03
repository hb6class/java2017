package com.hb.pm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05 {
	ArrayList students = new ArrayList();
	static String[] st={"학번","국어","영어","수학","과학"};
	
	private void showList() {
		// 보기
		System.out.println("---------------------------------");
//		System.out.println("학번\t국어\t영어\t수학");
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
		// 입력
		HashMap stu = new HashMap();
		for(int i=0; i<st.length; i++){
			stu.put(st[i], nums[i]);
		}
		students.add(stu);
	}
	private void listEdit() {
		// 수정
		
	}
	private void listDel() {
		// 삭제
		
	}

	public static void main(String[] args) {
		// 성적관리프로그램 (ver 7.1.0)
		// 컬렉션 프레임워크를 사용하여 완성
		// 학생 클래스 없이
		// 학생 - 학번 국어 영어 수학
		Scanner sc = new Scanner(System.in);
		Ex05 me = new Ex05();
		System.out.println("성적관리프로그램 (ver 7.1.0)");
		int menu=0;
		while(true){
			System.out.print("1.보기 2.입력 3.수정 4.삭제 0.종료>");
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












