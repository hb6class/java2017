package com.hb.am;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;

public class Ex09 extends JFrame implements ItemListener{
	JList list;
	public Ex09() {
		JPanel p1 = new JPanel();
		list = new JList(new DefaultListModel());
		DefaultListModel model = (DefaultListModel)list.getModel();
		model.addElement("아이템1");
		model.addElement("아이템2");
		model.addElement("아이템3");
		model.addElement("아이템4");
		model.addElement("아이템5");
		p1.add(list);
//		list.addItemListener(this);
		
		this.add(p1);
		this.setBounds(2000, 100, 400, 500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex09();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
//		System.out.println(e.getItem());
//		System.out.println(list.getSelectedItem());
	}

}
