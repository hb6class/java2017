package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Ex04 extends Frame implements MouseListener, MouseMotionListener {
	Button btn;
	public Ex04() {
		this.setLayout(null);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		this.setBounds(2000, 100, 500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("x:"+e.getX()+",y:"+e.getY());
		btn.setLocation(e.getX()-10, e.getY()-10);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		btn = new Button("*");
		btn.setBounds(0, 0, 20, 20);
		this.add(btn);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("마우스 움직임");
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}

}
