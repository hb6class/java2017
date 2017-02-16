package com.hb.am;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex05 extends Frame implements TextListener {
	TextField tf;
	public Ex05() {
		
		Panel p1 = new Panel();
		
		Font f = new Font("»õ±¼¸²", Font.BOLD, 20);
		
		tf = new TextField("",15);
		tf.setFont(f);
		tf.addTextListener(this);
		p1.add(tf);
		
		this.add(p1);
		this.setBounds(2000, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		System.out.println(tf.getText());
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println(tf.getText());
//	}

}
