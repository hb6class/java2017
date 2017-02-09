package com.hb.am;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// �����������α׷�(v 7.2.0)
		System.out.println("�����������α׷�(v 7.2.0)\n\n");
		Scanner sc = new Scanner(System.in);
		Ex02 me = new Ex02();
		while(me.start(sc)){
		}
		System.out.println("������ּż� �����մϴ�");
	}

	
	public void showMenu(){
		System.out.println("------------------------------------");
		System.out.print("1.���� 2.�Է� 0.����>");
	}
	public boolean start(Scanner sc){
		
		showMenu();
		int input=Integer.parseInt(sc.next());
				
		if(input==1){
			//����
			try {
				view();
			} catch (IOException e) {
				System.out.println("���� ����");
			}
		}else if(input==2){
			//�Է�
			System.out.print("�й�>");
			int num=Integer.parseInt(sc.next());
			System.out.print("����>");
			int kor=Integer.parseInt(sc.next());
			System.out.print("����>");
			int eng=Integer.parseInt(sc.next());
			System.out.print("����>");
			int math=Integer.parseInt(sc.next());
			try {
				add(num,kor,eng,math);
				System.out.println("�Է¿Ϸ�");
			} catch (IOException e) {
				System.out.println("�Է½���");
			}
		}else if(input==0){
			//����
			return false;
		}
		return true;
	}
	public void add(int num, int kor, int eng, int math) throws IOException{
		File file = new File("./text/student.txt");
		char[] cbuf = new char[12];
		int cnt=0;
		String db="";
		FileReader fr = new FileReader(file);
		while((cnt=fr.read(cbuf))!=-1){
			if(cnt==cbuf.length){
				db+=new String(cbuf);
			}else{
				char[] cbuf2=Arrays.copyOfRange(cbuf, 0, cnt);
				db+=new String(cbuf2);				
			}
		}
		String stu=db+num+"/"+kor+"/"+eng+"/"+math+"\r\n";
		FileWriter fw = new FileWriter(file);
		fw.write(stu);
		fr.close();
		fw.close();
	}
	
	public void view() throws IOException{
		ArrayList<String> list = new ArrayList<String>();
		char[] cbuf = new char[12];
		int cnt=0;
		File file = new File("./text/student.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		while(true){
			cnt=fr.read(cbuf, 0, cbuf.length);
			if(cnt==-1)break;
			list.add(new String(cbuf));			
		}
		System.out.println("�� �ο�:"+list.size());
		System.out.println("�й�\t����\t����\t����");
		for(String st:list){
			System.out.println("---------------------------------");
			st=st.substring(0, st.indexOf((int)'\r'));
			String[] sts=st.split("/");
			System.out.println(sts[0]+"\t"+sts[1]+"\t"+sts[2]+"\t"+sts[3]);
		}
	}
}







