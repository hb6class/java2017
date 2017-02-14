package com.hb.am2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex02 extends Frame {
	
	public Ex02(String title) {
		super(title);
		
//		FlowLayout lay = new FlowLayout();
		BorderLayout lay = new BorderLayout();
		// 동서남북 배치
		Panel pan = new Panel(lay);
		Panel pan1 = new Panel();
		Button btn1 = new Button();
		btn1.setLabel("버튼1");
		pan1.add(btn1);
		pan.add(pan1,BorderLayout.NORTH);
		Button btn2 = new Button();
		btn2.setLabel("버튼2");
		pan.add(btn2,BorderLayout.CENTER);
		Button btn3 = new Button();
		btn3.setLabel("버튼3");
		pan.add(btn3,BorderLayout.SOUTH);
		Button btn4 = new Button();
		btn4.setLabel("버튼4");
		pan.add(btn4,BorderLayout.WEST);
		Button btn5 = new Button();
		btn5.setLabel("버튼5");
		pan.add(btn5,BorderLayout.EAST);
		
		this.add(pan);
		
		setSize(200, 400);
		setLocation(1800,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02("제목없음2");
//		me.setTitle("제목없음");
	}

}
