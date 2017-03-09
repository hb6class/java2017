package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends Frame {
	String[] bat={BorderLayout.CENTER,BorderLayout.EAST,BorderLayout.WEST,BorderLayout.SOUTH,BorderLayout.NORTH};
	Panel pmain1, pmenu;
	
	public myFrame() {
		pmain1= new Panel();
		pmenu= new Panel(new BorderLayout());
		Panel[] pmenus=new Panel[5];
		for(int i=0; i<pmenus.length; i++){
			pmenus[i]=new Panel();
			pmenu.add(bat[i],pmenus[i]);
		}
		pmenus[0].setLayout(new GridLayout(5, 1));
		
		String[] btnLables={"����","�Է�","����","����","����"};
		Button[] btns = new Button[btnLables.length];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(btnLables[i]);
			pmenus[0].add(btns[i]);
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand());		
					if("�Է�".equals(e.getActionCommand())){
						add();
					}else if("����".equals(e.getActionCommand())){
						select();
					}
				}
			});
		}
		
		this.add(BorderLayout.CENTER, pmain1);
		this.add(BorderLayout.EAST, pmenu);
		
		this.setBounds(1600+200, 100, 600	, 400);
		this.setVisible(true);
	}
	
	private void select(){
		pmain1.setVisible(false);
		pmain1=new Panel();
		List list = new List();
		list.addItem("test1");
		list.addItem("test2");
		list.addItem("test3");
		list.addItem("test4");
		pmain1.add(list);
		this.add(BorderLayout.CENTER,pmain1);
		pmain1.setVisible(true);
		this.revalidate();
	}
	
	private void add(){
		pmain1.setVisible(false);
		pmain1 = new Panel(new BorderLayout());
		Panel[] p2 = new Panel[5];
		for(int i=0; i<p2.length; i++){
			p2[i]=new Panel();
			pmain1.add(bat[i],p2[i]);
		}
		p2[0].setLayout(new BorderLayout());
		Panel p2_1,p2_2;
		p2_1= new Panel(new GridLayout(4,2,50,50));
		p2_2= new Panel();
		
		String[] addst={"�̸�","����","����","����"};
		Label[] addLable=new Label[addst.length];
		TextField[] addTf=new TextField[addst.length];
		for(int i=0; i<addst.length; i++){
			addLable[i]=new Label(addst[i]);
			addTf[i]=new TextField();
			p2_1.add(addLable[i]);
			p2_1.add(addTf[i]);
		}
		
		Button btn2ok=new Button("Ȯ��");
		p2_2.add(btn2ok);
		btn2ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("DB add");
				System.out.println("�̸�:"+addTf[0].getText()+",����:"
				+addTf[1].getText()+",����:"+addTf[2].getText()+",����:"+addTf[3].getText());
			}
		});
		
		p2[0].add(BorderLayout.CENTER,p2_1);
		p2[0].add(BorderLayout.SOUTH,p2_2);
		
		this.add(BorderLayout.CENTER,pmain1);
		pmain1.setVisible(true);
		this.revalidate();
	}
	
}
