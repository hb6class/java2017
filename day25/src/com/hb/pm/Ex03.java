package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Ex03 extends Frame{

	public static void main(String[] args) {
		Frame f = new Frame();
//		BorderLayout lay = new BorderLayout();
//		f.setLayout(lay);
		f.setLayout(null);
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		btn1.setLocation(8, 30);
		btn1.setSize(100, 100);
		btn2.setLocation(108, 130);
		btn2.setSize(100, 100);
		
		f.add(btn1);
		f.add(btn2);
		f.setResizable(false);
		f.setLocation(2000,200);
		f.setSize(300, 400);
		f.setVisible(true);
	}

}
