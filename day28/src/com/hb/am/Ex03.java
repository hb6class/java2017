package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ex03 extends Frame implements ActionListener,Runnable {
	Button[] btns;
	Button strt;
	int cnt;
	Label la1, la2;
	static Thread thr;
	
	public Ex03() {
		Panel p1 = new Panel(new GridLayout(3,3));
		String[] nums={"7","8","9","4","5","6","1","2","3"};
		
		btns = new Button[9];
		for(int i=0; i<9; i++){
			btns[i]=new Button(nums[i]);
			p1.add(btns[i]);
			btns[i].addActionListener(this);
			btns[i].setEnabled(false);
		}
		strt=new Button("시작");
		strt.addActionListener(this);
		la1 = new Label();
		la2 = new Label();
		this.add(p1,BorderLayout.CENTER);
		this.add(strt,BorderLayout.EAST);
		this.add(la1,BorderLayout.SOUTH);
		this.add(la2,BorderLayout.NORTH);
		setBounds(1600, 0, 500, 500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 me = new Ex03();
		me.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("시작")){
			thr = new Thread(this);
			thr.start();
			strt.setEnabled(false);
			return;
		}
		cnt++;
		la1.setText("점수:"+cnt+"점");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int time=10;
		while(time-->0){
			la2.setText(time+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int su=ran.nextInt(9);
			for(int i=0; i<9; i++){
				btns[i].setEnabled(false);
			}
			btns[su].setEnabled(true);
		}
		for(int i=0; i<9; i++){
			btns[i].setEnabled(false);
		}
		cnt=0;
		strt.setEnabled(true);
	}

}
