package com.hb.am;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
	private File file;
	
	public Ex05() {
		file = new File("./text/student.bin");
		if(!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		// 성적관리프로그램(v 7.2.0)
		System.out.println("성적관리프로그램(v 7.2.0)\n\n");
		Scanner sc = new Scanner(System.in);
		Ex05 me = new Ex05();
		while(me.start(sc)){
			System.out.println();
			System.out.println();
			System.out.println();
		}
		System.out.println("사용해주셔서 감사합니다");
	}
	public void view() throws IOException{
		FileInputStream fis = null;
		DataInputStream dis = null;
		int num,kor,eng,math;
		try{
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			num=dis.readInt();
			kor=dis.readInt();
			eng=dis.readInt();
			math=dis.readInt();
		}finally{
			dis.close();
			fis.close();
		}
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println(num+"\t"+kor+"\t"+eng+"\t"+math);		
	}
	
	public void showMenu(){
		System.out.println("------------------------------------");
		System.out.print("1.보기 2.입력 0.종료>");
	}
	public boolean start(Scanner sc){
		
		showMenu();
		int input=Integer.parseInt(sc.next());
				
		if(input==1){
			//보기
			try {
				view();
			} catch (IOException e) {
				System.out.println("보기 오류");
			}
		}else if(input==2){
			//입력
			System.out.print("학번>");
			int num=Integer.parseInt(sc.next());
			System.out.print("국어>");
			int kor=Integer.parseInt(sc.next());
			System.out.print("영어>");
			int eng=Integer.parseInt(sc.next());
			System.out.print("수학>");
			int math=Integer.parseInt(sc.next());
			try {
				add(num,kor,eng,math);
				System.out.println("입력완료");
			} catch (IOException e) {
				System.out.println("입력실패");
			}
		}else if(input==0){
			//종료
			return false;
		}
		return true;
	}
	private void add(int num, int kor, int eng, int math) throws IOException {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try{
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			dos.writeInt(num);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
		}finally {
			dos.close();
			fos.close();
		}
		
		
	}
}
