package com.hb.am;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex06 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.naver.com/");
			System.out.println("hostname:"+url.getHost());
			System.out.println("port:"+url.getDefaultPort());
			URL url2 = new URL("https://www.google.co.kr/?gfe_rd=cr&ei=L1-mWMiCGoil8wfb27KADA");
			System.out.println("Protocol:"+url2.getProtocol());
			
			System.out.println("://");
			
			System.out.println("hostname:"+url2.getHost());
			System.out.println(":");
			System.out.println("port:"+url2.getDefaultPort());
			System.out.println("path:"+url2.getPath());
			System.out.println("?");
			System.out.println("Query:"+url2.getQuery());
			System.out.println("----------------------");
			System.out.println(url2.getFile());
			System.out.println(url2.toExternalForm());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
