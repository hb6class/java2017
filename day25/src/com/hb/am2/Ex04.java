package com.hb.am2;

import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Ex04 extends Frame {
	// CardLayout �� Frame�� �ٷ� �ٿ� ���
	// CardLayout �� setLayout(���̾ƿ�);
	CardLayout lay;
	
	public Ex04() {
		lay=new CardLayout();
		
		this.setLayout(lay);
		
		Panel p2=new Panel();
		p2.add(new Label("ù������"));
		Panel p3=new Panel();
		p3.add(new Label("�ι�°������"));
		Panel p4=new Panel();
		p4.add(new Label("����°������"));
		
		add("1", p2);
		add("2", p3);
		add("3", p4);
		
//		add(p1);
		setLocation(2000,200);
		setSize(300, 400);
		setVisible(true);
		change();
	}
	public void change(){
		for(int i=0; i<9; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			lay.next(this);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 me = new Ex04();
	}

}
