package com.hb.am;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex08 extends Frame implements ItemListener{
	Checkbox chk1,chk2,chk3;
	public Ex08() {
		Panel p1 = new Panel();
		chk1= new Checkbox("�߱�");
		chk2= new Checkbox("��");
		chk3= new Checkbox("�豸");
		p1.add(chk1);
		p1.add(chk2);
		p1.add(chk3);
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		
		this.add(p1);
		this.setBounds(2000, 100, 400, 500);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.print(e.getItem()+"��");
		if(e.getStateChange()==1){
			System.out.print("üũ��");
		}
		if(e.getStateChange()==2){
			System.out.print("üũ������");
		}
		System.out.println();
//		if(chk1.getState()){
//			System.out.print("�߱� ");
//		}
//		if(chk2.getState()){
//			System.out.print("�� ");
//		}
//		if(chk3.getState()){
//			System.out.print("�豸 ");
//		}
//		System.out.println();
	}

}
