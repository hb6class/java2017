package com.hb.am;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
//		Dialog dlg = new Dialog(f,"���̾�α�����",true);
		FileDialog dlg 
		= new FileDialog(f,"���̾�α�����",FileDialog.SAVE);
		dlg.setSize(200, 300);
		dlg.setLocation(2000, 200);
//		Button btn = new Button("����");
//		dlg.add(btn);
		
		f.setBounds(2000, 100, 300, 400);
		f.setVisible(false);
		dlg.setVisible(true);
	}

}
