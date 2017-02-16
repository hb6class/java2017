package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class Ex02 extends Frame implements ActionListener {
	
	private JTable jtable;
	private Model model;
	private CardLayout card;
	private TextField tf1,tf2,tf3,tf4;

	class Model extends AbstractTableModel{
		String[] title ={"학번","국어","영어","수학"};
		Object[][] rows=new Object[0][];
		////////////////////
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return rows.length;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return title.length;
		}

		@Override
		public Object getValueAt(int row, int col) {
			return rows[row][col];
		}
		///////////////////
		@Override
		public String getColumnName(int col) {
			return title[col];
		}
	}
	public Ex02() {
		card= new CardLayout();
		this.setLayout(card);
		
		Panel p1= new Panel(new BorderLayout());
		
		model= new Model();
		jtable= new JTable(model);
		JScrollPane jsp=new JScrollPane(jtable);
		p1.add(jsp,BorderLayout.CENTER);
		Button btn1 = new Button("추가");
		btn1.addActionListener(this);
		p1.add(btn1,BorderLayout.SOUTH);
		p1.add(new Label("학생성적관리프로그램 v8.0"),BorderLayout.NORTH);
		
		jtable.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("눌림");
				System.out.println(jtable.getSelectedRow());
			}
		});
		
		Panel p2= new Panel(new GridLayout(5,3));
		Label la1=new Label("학번",Label.CENTER);
		Label la2=new Label("국어",Label.CENTER);
		Label la3=new Label("영어",Label.CENTER);
		Label la4=new Label("수학",Label.CENTER);
		Font f= new Font("새굴림", Font.BOLD, 20);
		la1.setFont(f);
		la2.setFont(f);
		la3.setFont(f);
		la4.setFont(f);
		tf1=new TextField("",15);
		tf2=new TextField("",15);
		tf3=new TextField("",15);
		tf4=new TextField("",15);
		p2.add(la1);
		p2.add(tf1);
		p2.add(la2);
		p2.add(tf2);
		p2.add(la3);
		p2.add(tf3);
		p2.add(la4);
		p2.add(tf4);
		Button btn3 = new Button("입력");
		btn3.addActionListener(this);
		p2.add(btn3);
		Panel p3= new Panel();
		p3.add(p2);
		
		this.add("main",p1);
		this.add("add",p3);
		this.setBounds(2000, 100, 700, 500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02();
		me.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("추가".equals(e.getActionCommand())){
			card.next(this);
		}else if("입력".equals(e.getActionCommand())){
			Object[][] data = model.rows;
			Object[][] tmp = new Object[data.length+1][];
			System.arraycopy(data, 0, tmp, 0, data.length);
			tmp[data.length]=new Object[4];
			tmp[data.length][0]=tf1.getText();
			tmp[data.length][1]=tf2.getText();
			tmp[data.length][2]=tf3.getText();
			tmp[data.length][3]=tf4.getText();
			model.rows=tmp;
			System.out.println(data.length);
			jtable.updateUI();// jtable새로고침
			card.next(this);
		}
	}

}
