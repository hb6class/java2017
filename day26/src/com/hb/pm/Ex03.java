package com.hb.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex03 extends Frame implements WindowListener{
	
	public Ex03() {
		
		this.addWindowListener(this);
		
		this.setBounds(2000, 100, 300, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 열렸을 때");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// x버튼을 눌렀을때
		System.out.println("창 닫음 누름");
//		System.exit(0);
		this.dispose(); // 닫기
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창의 정상적인 종료");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("최소화");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("최소화 해제");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 활성화 되었을때");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("창이 비활성화 되었을때");
	}

}
