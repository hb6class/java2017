package com.hb.am2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("배치관리자");
		
		GridLayout lay = new GridLayout(2,2);
		Panel p1 = new Panel(lay);
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
		Button btn6 = new Button("btn6");
		Button btn7 = new Button("btn7");
		
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.add(btn5);
		p1.add(btn6);
		p1.add(btn7);
		
		f.add(p1);
		f.setLocation(2000, 100);
		f.setSize(300, 400);
		f.setVisible(true);
	}

}
