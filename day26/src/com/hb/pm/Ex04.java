package com.hb.pm;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex04 implements WindowListener {
	Frame f;
	public Ex04() {
		Frame frame = f;
		frame = new Frame();
		
		frame.addWindowListener(this);
		frame.setBounds(2000, 100, 200, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 me = new Ex04();
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
		System.exit(0);
//		f.dispose(); // �ݱ�
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
