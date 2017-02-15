package com.hb.pm;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex06 extends Frame implements ActionListener{
//	Button btn1, btn2;
	TextField tf;
	public Ex06() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Panel p1 = new Panel();
		tf = new TextField("",15);
		p1.add(tf);
		Button btn1 = new Button("전송");
		btn1.addActionListener(this);
		p1.add(btn1);
		Button btn2 = new Button("종료");
		btn2.addActionListener(this);
		p1.add(btn2);
		
		
		add(p1);
		setBounds(2000, 100, 400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex06();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name=e.getActionCommand();
		if(name.equals("전송"))System.out.println(tf.getText());
		if(name.equals("종료"))System.exit(0);
//		if(e.getSource()==btn1)System.out.println("ActionListener 발동");
//		if(e.getSource()==btn2)System.exit(0);
	}

}
