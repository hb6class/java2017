package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex02 extends Frame {
	
	
	public Ex02() {
		GridBagLayout lay = new GridBagLayout();
		this.setLayout(lay);
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		
		Button btn7 = new Button("7");
		lay.setConstraints(btn7, gbc);
		
		Button btn8 = new Button("8"); 
		gbc.gridx=1;
		lay.setConstraints(btn8, gbc);
		Button btn9 = new Button("9"); 
		gbc.gridx=2;
		lay.setConstraints(btn9, gbc);
		
		Button btn4 = new Button("4");
		gbc.gridx=0;
		gbc.gridy=1;
		lay.setConstraints(btn4, gbc);
		
		Button btn5 = new Button("5"); 
		gbc.gridx=1;
		lay.setConstraints(btn5, gbc);
		Button btn6 = new Button("6"); 
		gbc.gridx=2;
		lay.setConstraints(btn6, gbc);
		
		Button btn1 = new Button("1");
		gbc.gridx=0;
		gbc.gridy=2;
		lay.setConstraints(btn1, gbc);
		
		Button btn2 = new Button("2"); 
		gbc.gridx=1;
		lay.setConstraints(btn2, gbc);
		Button btn3 = new Button("3"); 
		gbc.gridx=2;
		lay.setConstraints(btn3, gbc);
		
		Button btn0 = new Button("0");
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=2;
		lay.setConstraints(btn0, gbc);
		
		Button btn10 = new Button("+");
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridwidth=1;
		lay.setConstraints(btn10, gbc);
		
		Button btn11=new Button("=");
		gbc.gridy=1;
		gbc.gridheight=2;
		lay.setConstraints(btn11, gbc);
		
		Button btn12=new Button("-");
		gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		lay.setConstraints(btn12, gbc);
		
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn0);
		add(btn10);
		add(btn11);
		add(btn12);
		setLocation(2000,100);
		setSize(500, 400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02();
	}

}
