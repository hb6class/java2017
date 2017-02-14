package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex05 extends Frame {
	
	public Ex05() {
		
		GridBagLayout lay= new GridBagLayout();
		this.setLayout(lay);
		GridBagConstraints gbc= new GridBagConstraints();
		
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		Button btn1= new Button("btn1");
		gbc.gridwidth=2;
		lay.setConstraints(btn1, gbc);
		Button btn2= new Button("btn2");
		gbc.gridx=2;
		gbc.gridwidth=4;
		gbc.weightx=2.0;
		lay.setConstraints(btn2, gbc);
		
		Button btn3 = new Button("btn3");
		gbc.gridx=0;		
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.weighty=2.0;
		
		lay.setConstraints(btn3, gbc);
		Button btn4 = new Button("btn4");
		gbc.gridx=2;		
		lay.setConstraints(btn4, gbc);
		Button btn5 = new Button("btn5");
		gbc.gridx=4;		
		lay.setConstraints(btn5, gbc);
		
		GridLayout l1= new GridLayout(1,2);
		Button btn6 = new Button("btn6");
		Button btn7 = new Button("btn7");
		Panel p1= new Panel(l1);
		p1.add(btn6);
		p1.add(btn7);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=6;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1.0;
		lay.setConstraints(p1, gbc);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(p1);
		this.setLocation(2000, 100);
		this.setSize(300, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05 me = new Ex05();
	}

}
