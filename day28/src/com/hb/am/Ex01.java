package com.hb.am;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Ex01 extends Frame {
	
	public Ex01() {
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension scn = tool.getScreenSize();
		System.out.println(scn.getWidth());
		System.out.println(scn.getHeight());
		setBounds(1600, 0, 500, 300);
		Dimension fsize = this.getSize();
		System.out.println(fsize.getWidth());
		System.out.println(fsize.getHeight());
		
		this.setLocation(
				(int)scn.getWidth()/2-(int)fsize.getWidth()/2+1600
				, (int)scn.getHeight()/2-(int)fsize.getHeight()/2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex01 me = new Ex01();
		me.setVisible(true);
	}

}
