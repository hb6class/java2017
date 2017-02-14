package com.hb.pm;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex04 extends Frame{
	
	public Ex04() {
		Panel p1 = new Panel();
		Label la1 = new Label("id:");
		p1.add(la1);
//		TextField tf1 = new TextField();
//		tf1.setColumns(10);// 글자수
//		tf1.setText("아이디입력란");
		TextField tf1 = new TextField("입력란",15);
		p1.add(tf1);
		Label la2 = new Label("pw:");
		p1.add(la2);
		TextField tf2 = new TextField("입력란",15);
		tf2.setEchoChar('#');
		p1.add(tf2);
		
		TextArea ta
//		= new TextArea("내용입력란",15,20,0);
//		= new TextArea("내용입력란",15,20,3);
//		= new TextArea("내용입력란",15,20,2);
		= new TextArea("내용입력란",15,20,1);
		System.out.println(TextArea.SCROLLBARS_BOTH);
		System.out.println(TextArea.SCROLLBARS_NONE);
		System.out.println(TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		System.out.println(TextArea.SCROLLBARS_VERTICAL_ONLY);
//		ta.setColumns(10);
//		ta.setRows(15);
		p1.add(ta);
		
		this.add(p1);
		this.setLocation(2000, 100);
		this.setSize(300,400);
		this.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// 
		Ex04 me = new Ex04();

	}

}
