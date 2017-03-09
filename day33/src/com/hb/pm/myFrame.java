package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class myFrame extends Frame {
	String[] bat={BorderLayout.CENTER,BorderLayout.EAST,BorderLayout.WEST,BorderLayout.SOUTH,BorderLayout.NORTH};
	String[] addst={"이름","국어","영어","수학"};
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
		
		String[] btnLables={"보기","입력","수정","삭제","종료"};
		Button[] btns = new Button[btnLables.length];
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button(btnLables[i]);
			pmenus[0].add(btns[i]);
			btns[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getActionCommand());		
					if("입력".equals(e.getActionCommand())){
						add();
					}else if("보기".equals(e.getActionCommand())){
						select();
					}else if("수정".equals(e.getActionCommand())){
						edit();
					}else if("삭제".equals(e.getActionCommand())){
						del();
					}else{
						System.exit(0);
					}
				}
			});
		}
		
		this.add(BorderLayout.CENTER, pmain1);
		this.add(BorderLayout.EAST, pmenu);
		
		this.setBounds(1600+200, 100, 600	, 400);
		this.setVisible(true);
	}
	
	private void del(){
		String sql="select num from stu03 order by num";
		pmain1.setVisible(false);
		pmain1=new Panel();
		
		pmain1.add(new Label("학번:"));
		Choice cho= new Choice();
		JavaDAO dao = new JavaDAO();
		dao.dbNumSelect(sql, cho);
		pmain1.add(cho);
		Button btn4=new Button("확인");
		pmain1.add(btn4);
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String sql="delete from stu03 where num="+cho.getSelectedItem();
				System.out.println("delete from stu03 where num="+cho.getSelectedItem());
				JavaDAO dao=new JavaDAO();
				dao.dbUpdate(sql);
			}
		});
		
		pmain1.setVisible(true);
		this.add(BorderLayout.CENTER,pmain1);
		this.revalidate();
	}
	
	private void edit(){
		String sql="select num from stu03 order by num";
		pmain1.setVisible(false);
		pmain1=new Panel(new BorderLayout());
		Panel[] p3=new Panel[3];
		String[] bat={BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.SOUTH};
		for(int i=0; i<p3.length; i++){
			p3[i]=new Panel();
			pmain1.add(bat[i],p3[i]);
		}
		
		p3[0].setLayout(new GridLayout(5,2,50,50));
		Label editLable = new Label("학번");
		Choice editCho=new Choice();
		
		JavaDAO dao = new JavaDAO();
		dao.dbNumSelect(sql, editCho);
		
		p3[0].add(editLable);
		p3[0].add(editCho);
		Label[] editLabs=new Label[addst.length];
		TextField[] editTf=new TextField[addst.length];
		for(int i=0; i<addst.length; i++){
			editLabs[i]=new Label(addst[i]);
			editTf[i]=new TextField();		
			p3[0].add(editLabs[i]);
			p3[0].add(editTf[i]);
		}
		
		Button btn3_1=new Button("확인");
		Button btn3_2=new Button("취소");
		p3[2].add(btn3_1);
		p3[2].add(btn3_2);
		
		editCho.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String sql= "select * from stu02 where num="+e.getItem().toString();
				System.out.println(sql);
				JavaDAO dao = new JavaDAO();
				dao.dbNumSelect(sql, editTf);
			}
		});
		btn3_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.print("학번:"+editCho.getSelectedItem());
				
				for(int i=0;i<addst.length; i++){
					System.out.print(",");
					System.out.print(addst[i]+":"+editTf[i].getText());
				}
				System.out.println();
				String sql = "update stu03 set name='"+editTf[0].getText()+"',kor=";
				sql+=editTf[1].getText()+",eng="+editTf[2].getText()+",math="+editTf[3].getText();
				sql+=" where num="+editCho.getSelectedItem();
				System.out.println(sql);
				JavaDAO dao = new JavaDAO();
				dao.dbUpdate(sql);
			}
		});
		
		pmain1.setVisible(true);
		this.add(BorderLayout.CENTER,pmain1);
		this.revalidate();
	}
	
	private void select(){
		String sql="select * from stu03 order by num";
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
		
		Label[] addLable=new Label[addst.length];
		TextField[] addTf=new TextField[addst.length];
		for(int i=0; i<addst.length; i++){
			addLable[i]=new Label(addst[i]);
			addTf[i]=new TextField();
			p2_1.add(addLable[i]);
			p2_1.add(addTf[i]);
		}
		
		Button btn2ok=new Button("확인");
		p2_2.add(btn2ok);
		btn2ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("DB add");
				System.out.println("이름:"+addTf[0].getText()+",국어:"
				+addTf[1].getText()+",영어:"+addTf[2].getText()+",수학:"+addTf[3].getText());
				String sql="insert into stu03 values (stu03_seq.nextval,'"+addTf[0].getText()+"',";
				sql+=addTf[1].getText()+","+addTf[2].getText()+","+addTf[3].getText()+")";
				System.out.println(sql);
				JavaDAO dao=new JavaDAO();
				dao.dbUpdate(sql);
			}
		});
		
		p2[0].add(BorderLayout.CENTER,p2_1);
		p2[0].add(BorderLayout.SOUTH,p2_2);
		
		this.add(BorderLayout.CENTER,pmain1);
		pmain1.setVisible(true);
		this.revalidate();
	}
	
}
