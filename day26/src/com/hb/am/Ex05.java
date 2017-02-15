package com.hb.am;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex05 extends Frame {
	
	class Inner extends Canvas{
		
		@Override
		public void paint(Graphics g) {
			Image img 
			= Toolkit.getDefaultToolkit().getImage("./img/ls-screen.gif");
			g.drawImage(img, 0, 0, this);
//			g.drawLine(0, 0, 300, 300);
//			g.drawRect(100, 100, 50, 50);
//			g.drawOval(200, 200, 50, 50);
//			g.drawArc(300, 150, 100, 100, 0, 50);
//			g.setColor(Color.BLUE);
//			g.fillRect(300, 50, 50, 50);
		}
	}
	
	public Ex05() {
		
		Inner can = new Inner();
		
		can.setBackground(Color.red);
		this.add(can);
		this.setBounds(2000, 100, 500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

}
