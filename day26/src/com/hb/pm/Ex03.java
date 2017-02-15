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
		System.out.println("â�� ������ ��");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// x��ư�� ��������
		System.out.println("â ���� ����");
//		System.exit(0);
		this.dispose(); // �ݱ�
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("â�� �������� ����");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�ּ�ȭ");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�ּ�ȭ ����");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("â�� Ȱ��ȭ �Ǿ�����");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("â�� ��Ȱ��ȭ �Ǿ�����");
	}

}
