package com.hb.am;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex02 extends Frame implements ActionListener {
	Button[] btns;
	
	public Ex02() {
		Panel p1 = new Panel(new GridLayout(3,3));
		String[] nums={"7","8","9","4","5","6","1","2","3"};
		
		btns = new Button[9];
		for(int i=0; i<9; i++){
			btns[i]=new Button(nums[i]);
		}
		for(int i=0; i<9; i++){
			p1.add(btns[i]);
		}
		for(int i=0; i<9; i++){
			btns[i].addActionListener(this);
		}
		
		this.add(p1);
		setBounds(1600, 0, 500, 500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02();
		me.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub\
		for(int i=0; i<btns.length; i++){
			if(btns[i].getLabel().equals(e.getActionCommand()))
				btns[i].setEnabled(false);
		}
		
		System.out.println(e.getActionCommand());
	}

}
