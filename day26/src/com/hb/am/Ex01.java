package com.hb.am;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Ex01 {

	public static void main(String[] args) {
		// ui - main ������󿡼��� 
		Frame f= new Frame("üũ�ڽ�");
		
		Panel p1 = new Panel(null);
		Label sub = new Label("����",Label.CENTER);
		sub.setLocation(100-16, 0);
		sub.setSize(100, 50);
		Font fnt = new Font("�޸�����ü",Font.BOLD,22);
		sub.setFont(fnt);
		sub.setBackground(Color.RED);
		p1.add(sub);
		////////////////////////////////////////////////
		Label id= new Label("id",Label.RIGHT);
		id.setBounds(50, 100, 50, 20);
		p1.add(id);
		TextField tid=new TextField();
		tid.setBounds(100, 100, 100, 20);
		p1.add(tid);
		////////////////////////////////////////////////
		Checkbox chck1= new Checkbox();
		chck1.setLabel("��");
		chck1.setBounds(50, 150, 50, 20);
		p1.add(chck1);
		Checkbox chck2 = new Checkbox("�߱�");
		chck2.setBounds(100, 150, 50, 20);
		p1.add(chck2);
		Checkbox chck3 = new Checkbox("�豸",true);
		chck3.setBounds(150, 150, 50, 20);
		p1.add(chck3);
		////////////////////////////////////////////////
		CheckboxGroup chG=new CheckboxGroup();
		
		Checkbox radio1=new Checkbox("����",chG,false);
		Checkbox radio2=new Checkbox("��ȭ",chG,true);
		Checkbox radio3=new Checkbox("����",chG,false);
		
		radio1.setBounds(50, 200, 50, 20);
		radio2.setBounds(100, 200, 50, 20);
		radio3.setBounds(150, 200, 50, 20);
		
		p1.add(radio1);
		p1.add(radio2);
		p1.add(radio3);
		////////////////////////////////////////////////
		Label la5 = new Label("����:");
		la5.setBounds(50, 250, 50, 20);
		p1.add(la5);
		Choice list5 = new Choice();
		list5.add("������1");
		list5.add("������2");
		list5.add("������3");
		list5.add("������4");
		list5.add("������5");
		list5.setBounds(100, 250, 100, 60);
		p1.add(list5);
		////////////////////////////////////////////////
		List list6 = new List(2,true);
		list6.add("������1");
		list6.add("������2");
		list6.add("������3");
		list6.add("������4");
		list6.setBounds(100, 300, 150, 60);
		p1.add(list6);
		////////////////////////////////////////////////
		
		f.add(p1);
		f.setLocation(2000, 100);
		f.setSize(300, 600);
		f.setVisible(true);
	}

}
