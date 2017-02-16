package com.hb.am;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex07 extends Frame implements KeyListener {
	Button btn;
	int x,y;
	
	public Ex07() {
		Panel p1 = new Panel(null);
		
		btn =new Button("*");
		x=250;
		y=200;
		btn.setBounds(x, y, 20, 20);
		btn.addKeyListener(this);
		p1.add(btn);
		
		this.add(p1);
		
		this.setBounds(2000, 100, 500, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex07();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	int i=10;
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==37){
			if(x>8){
				x-=i;
				btn.setLocation(x, y);
			}
		}else if(e.getKeyCode()==38){
			if(y>8){
				y-=i;
				btn.setLocation(x, y);
			}
		}else if(e.getKeyCode()==39){
			if(x<460){
				x+=i;
				btn.setLocation(x, y);
			}
		}else if(e.getKeyCode()==40){
			if(y<340){
				y+=i;
				btn.setLocation(x, y);
			}
		}
		System.out.print("x:"+x);
		System.out.println(",y:"+y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
