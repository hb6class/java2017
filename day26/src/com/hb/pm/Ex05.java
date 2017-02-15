package com.hb.pm;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

class WinListener implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
	
}

public class Ex05 {
	
	public Ex05() {
		JFrame f = new JFrame();
		
//		WindowListener wl = new WinListener(){
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		};
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
		f.setBounds(2000, 100, 200, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}

}
