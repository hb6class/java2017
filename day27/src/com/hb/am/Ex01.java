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
		
		JButton btn1 = new JButton("��ư");
		btn1.addMouseListener(this);//��ư�� �̺�Ʈ����
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
		System.out.println("���콺 Ŭ��(�����ٶ�����)");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ������");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("(���ȴ�)���콺 �ö��");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ���� �ö�");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺 ��������");
	}

}
