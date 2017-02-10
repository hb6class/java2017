package com.hb.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{ //명시적
	int kor,eng,math;
}

public class Ex03 {

	public static void main(String[] args) {
		File file = new File("./text/data.txt");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		
		try {
			fos=new FileOutputStream(file);
			oos=new ObjectOutputStream(fos);
			Student stu = new Student();
			stu.kor=90;
			stu.eng=80;
			stu.math=70;
			oos.writeObject(stu);
			oos.flush();
			
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			
			Student stu2 =(Student)ois.readObject();
			
			System.out.println("국어:"+stu2.kor);
			System.out.println("영어:"+stu2.eng);
			System.out.println("수학:"+stu2.math);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null)oos.close();
				if(ois!=null)ois.close();
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
