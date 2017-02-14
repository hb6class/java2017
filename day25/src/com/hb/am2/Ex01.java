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
		// 1.AWT - os에게 요청
		// 2.스윙 - java직접
		Frame fr= new Frame("새로운제목");	//창객체를 생성
		
		Panel pan=new Panel();
		
		Button btn1 = new Button("버튼1");
		pan.add(btn1);
		Button btn2 = new Button();
		btn2.setLabel("버튼2");
		pan.add(btn2);
		Label la1= new Label("버튼들");
		pan.add(la1);
		fr.add(pan);
		
		
		fr.setSize(400, 300);	//크기
		fr.setLocation(1800,200);
		fr.setBackground(Color.WHITE);
//		fr.setTitle("자바UI");	//제목주기
		boolean show=true;
		fr.setVisible(show);	//보이게 하기
	}
}
