package com.hb.pm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

public class Ex04 {
	Vector<Vector> stus;
	
	public Ex04() {
		stus=new Vector<Vector>();
		setting();
	}
	
	private void setting(){
		File file = new File("./text/stu.bin");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
				if(!file.exists()){
					file.createNewFile();
					
				}else if(file.length()!=0){
				fis=new FileInputStream(file);
				ois=new ObjectInputStream(fis);
				//////////���� �ʱ�ȭ///////////
				stus=(Vector<Vector>)ois.readObject();
				////////////////////////////////
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					if(ois!=null)ois.close();
					if(fis!=null)fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
	}
	private void add(Vector<Integer> vec){
		stus.add(vec);
	}
	private void show(){
		System.out.println("-----------------------------------------------");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<stus.size(); i++){
			Vector stu=stus.get(i);
			for(int j=0; j<stu.size(); j++){
				System.out.print(stu.get(j)+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	private void save(){
		File file = new File("./text/stu.bin");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			
			oos.writeObject(stus);
			oos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private boolean program(Scanner sc){
		System.out.println("1.���� 2.�Է� 3.���� 4.���� 5.���� 0.����");
		System.out.print(">");
		switch (sc.nextInt()) {
		case 1:
			show();
			break;
		case 2:
			Vector<Integer> vec=new Vector<Integer>();
			String[] col= {"�й�","����","����","����"};
			for(int i=0;i<col.length; i++){
				System.out.print(col[i]);
				vec.add(sc.nextInt());
			}
			add(vec);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			save();
			break;
		case 0:
			return false;
		default:
			break;
		}
		return true;
	}

	public static void main(String[] args) {
		// �������� ���α׷�(ver 7.2.1)
		System.out.println("�������� ���α׷�(ver 7.2.1)");
		Ex04 me = new Ex04();
		Scanner sc = new Scanner(System.in);
		while(me.program(sc)){
			System.out.println();
		}
		System.out.println("�����Ͻð� �����ðڽ��ϱ�?");
		System.out.print("1.���� 0.�������>");
		switch (sc.nextInt()) {
		case 1:
			me.save();
			break;

		default:
			break;
		}
		System.out.println("�����մϴ�");
		
	}

}
