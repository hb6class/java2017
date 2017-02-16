package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex03 implements MouseListener {
	Button btn;
	
	public Ex03() {
		Frame f = new Frame();
		f.setLayout(null);
		btn = new Button("@");
		btn.setSize(20, 20);
		f.add(btn);
		f.addMouseListener(this);
		
		
		f.setBounds(2000, 100, 400, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("Å¬¸¯- x:"+e.getX());
		System.out.println(",y:"+e.getY());
		btn.setLocation(e.getX()-10,e.getY()-10);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
