package com.hb.am;

import java.awt.CheckboxMenuItem;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;

public class Ex03 extends Frame {
	
	public Ex03() {
//		Font f = new Font("새굴림", Font.PLAIN, 16);
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Help");
//		m1.setFont(f);
//		m2.setFont(f);
//		m3.setFont(f);
		MenuItem item1_1 = new MenuItem("New");
		MenuItem item1_2 = new MenuItem("Open");
		MenuItem item1_3 = new MenuItem("Exit");
		
		CheckboxMenuItem item2_1=new CheckboxMenuItem("덮어쓰기");
		CheckboxMenuItem item2_2=new CheckboxMenuItem("추가하기",true);
		
		PopupMenu item3 = new PopupMenu("선택");
		MenuItem item3_1 = new MenuItem("help");
		MenuItem item3_2 = new MenuItem("About");
		item3.add(item3_1);
		item3.add(item3_2);
		
		m3.add(item3);
		
		m2.add(item2_1);
		m2.add(item2_2);
		
		m1.add(item1_1);
		m1.add(item1_2);
		m1.addSeparator();
		m1.add(item1_3);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		this.setMenuBar(mb);
		this.setBounds(2000, 100, 400, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex03();
	}

}
