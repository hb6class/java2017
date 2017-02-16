package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex02 extends Frame implements ActionListener {
	
	public Ex02() {
		Panel p1 = new Panel();
		
		TextField tf=new TextField("",10);
		tf.addActionListener(this);
		p1.add(tf);
		
		Button btn1 = new Button("버튼");
		btn1.addActionListener(this);
		p1.add(btn1);
		btn1.setEnabled(false);
		
		this.add(p1);
		this.setBounds(2000, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("이벤트 발동함");
	}

}
