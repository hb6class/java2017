package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("그리드백배치관리자");
		
		GridBagLayout lay = new GridBagLayout();
		
		GridBagConstraints gbc= new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;	// 채우는 방식
		f.setLayout(lay);
		
		Button btn1 = new Button("btn1");
		gbc.gridx=0;		//좌표값
		gbc.gridy=0;
		gbc.gridwidth=1;	//사이즈
		gbc.gridheight=1;
		gbc.weightx=1.0;	//가중
		gbc.weighty=1.0;
		lay.setConstraints(btn1, gbc);
		Button btn2 = new Button("btn2");
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=2.0;
		gbc.weighty=1.0;
		lay.setConstraints(btn2, gbc);
		Button btn3 = new Button("btn3");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		lay.setConstraints(btn3, gbc);
		
		f.add(btn1);
		f.add(btn2);
//		f.add(btn3);
		
		f.setLocation(2000, 200);
		f.setSize(400, 300);
		f.setVisible(true);
	}

}
