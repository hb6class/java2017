package com.hb.pm;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex04 {

	public static void main(String[] args) {
		// Map
		//
		// HashMap
		// Hashtable
		// TreeMap
		Map map = new HashMap();
		// key, value
		System.out.println(">>>>>>"+map.put(1, "ÇÏ³ª"));
		map.put(2, 33333);
		map.put(3, "¼¼¿§");
		map.put(4, "³×¿§");
//		map.remove("µÑ");
		Map map2 = new HashMap();
		map2.putAll(map);
		map.put(2,"µÎ¿ï");
		Set keys = map2.keySet();
		Iterator ite = keys.iterator();
		while(ite.hasNext()){
			Object key = ite.next();
			System.out.println("key:"+key+",value:"+map2.get(key));
		}
		System.out.println(map2.size());
	}

}






