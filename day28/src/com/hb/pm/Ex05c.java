package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05c extends Frame implements ActionListener{
	TextField tf;
	Socket sock;
	OutputStream os=null;
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;
	
	public Ex05c() {
		tf= new TextField();
		TextArea ta = new TextArea();
		Button btn = new Button("Àü¼Û");
		btn.addActionListener(this);
		
		this.add(tf,BorderLayout.SOUTH);
		this.add(ta,BorderLayout.CENTER);
		this.add(btn,BorderLayout.EAST);
		
		
		this.setBounds(2000, 100, 500, 400);
		this.setVisible(true);
		
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			sock = new Socket("203.236.209.193",6000);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			
			String msg=br.readLine();
			ta.setText(msg+"\n");
			
			while((msg=br.readLine())!=null){
				ta.append(msg+"\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null)bw.close();
				if(osw!=null)osw.close();
				if(os!=null)os.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf.getText();
		try {
			bw.write(msg);
			bw.newLine();
			bw.flush();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex05c me = new Ex05c();
	}


}
