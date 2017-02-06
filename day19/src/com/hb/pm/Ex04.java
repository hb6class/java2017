package com.hb.pm;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1=System.currentTimeMillis();//January 1, 1970 ~
		char[] ch1 = {'a','b','c','d'};
		char[] ch2 = {'1','2','3','4','5','6','7'};
		System.arraycopy(ch1, 1, ch2, 2, 2);
		String tmp="";
		for(int i=0; i<ch2.length; i++){
			System.out.println(ch2[i]);
		}
		for(int i=0; i<100000; i++){
			new Ex04();
			tmp=i+"";
		}
		long time2=System.currentTimeMillis();
		System.out.println(time2-time1);
		System.exit(0);
		System.out.println("---------------------------------------");
		Map<String, String> map = System.getenv();
		Set<String> key = map.keySet();
		Iterator<String> ite = key.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());			
		}
		System.out.println("---------------------------------------");
		System.out.println(map.get("JAVA_HOME"));
		System.out.println(map.get("Path"));
		System.out.println(map.get("TEMP"));
		System.out.println(map.get("SystemDrive"));
		System.out.println("---------------------------------------");
		Properties prop = System.getProperties();
		Set<Object> key2 = prop.keySet();
		Iterator<Object> ite2 = key2.iterator();
		while(ite2.hasNext()){
			System.out.println(ite2.next());
		}
		System.out.println("---------------------------------------");
		System.out.println(prop.getProperty("java.version"));
		System.out.println(prop.getProperty("java.home"));
	}

}














