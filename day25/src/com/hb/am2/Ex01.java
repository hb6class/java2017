package com.hb.am2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex01 {

	public static void main(String[] args) {
		// UI
		//
		// 1.AWT - os���� ��û
		// 2.���� - java����
		Frame fr= new Frame("���ο�����");	//â��ü�� ����
		
		Panel pan=new Panel();
		
		Button btn1 = new Button("��ư1");
		pan.add(btn1);
		Button btn2 = new Button();
		btn2.setLabel("��ư2");
		pan.add(btn2);
		Label la1= new Label("��ư��");
		pan.add(la1);
		fr.add(pan);
		
		
		fr.setSize(400, 300);	//ũ��
		fr.setLocation(1800,200);
		fr.setBackground(Color.WHITE);
//		fr.setTitle("�ڹ�UI");	//�����ֱ�
		boolean show=true;
		fr.setVisible(show);	//���̰� �ϱ�
	}
}
