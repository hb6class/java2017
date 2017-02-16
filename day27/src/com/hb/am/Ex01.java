package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Ex01 extends Frame implements MouseListener{
	
	public Ex01() {
		Panel p1 = new Panel();
		
		TextField tf=new TextField("",10);
		tf.addMouseListener(this);
		p1.add(tf);
		
		JButton btn1 = new JButton("버튼");
		btn1.addMouseListener(this);//버튼에 이벤트붙임
		p1.add(btn1);
		btn1.setEnabled(false);
		
		this.add(p1);
		this.setBounds(2000, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex01();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭(눌렀다땠을때)");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 눌렸음");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("(눌렸던)마우스 올라옴");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 위로 올라감");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 빠져나감");
	}

}
