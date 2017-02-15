package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Scrollbar;

public class Ex04 extends Frame {

	public Ex04() {
		
		Scrollbar bar1 = new Scrollbar();
		Scrollbar bar2 = new Scrollbar(Scrollbar.HORIZONTAL);
		this.add(bar1,BorderLayout.EAST);
		this.add(bar2,BorderLayout.SOUTH);
		this.setBounds(2000, 100, 300, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
