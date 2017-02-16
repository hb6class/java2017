package com.hb.am;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame implements KeyListener {
	
	private TextField tf;

	public Ex06() {
		Panel p1 = new Panel();
		
		Font f = new Font("������", Font.BOLD, 20);
		
		tf = new TextField("",15);
		tf.setFont(f);
		tf.addKeyListener(this);
		p1.add(tf);
		
		
		this.add(p1);
		this.setBounds(2000, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������:"+e.getKeyCode());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("������ ��Ȳ:"+e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("(���ȴ�)��:"+e.getKeyCode());
	}

}
