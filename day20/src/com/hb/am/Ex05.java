package com.hb.am;

import java.util.Set;
import java.util.TreeSet;

public class Ex05 {
	class Names implements Comparable<Names>{
		String name;
		public Names(String name) {
			this.name=name;
		}
		@Override
		public String toString() {
			return name;
		}
		@Override
		public int compareTo(Names o) {
//			return name.compareTo(o.name);
			return 0;
		}
	}

	public static void main(String[] args) {
		Ex05 me = new Ex05();
		TreeSet<Names> set = new TreeSet<Names>();
		set.add(me.new Names("홍길동"));
		set.add(me.new Names("이길동"));
		set.add(me.new Names("박길동"));
		set.add(me.new Names("홍길동"));
		System.out.println(set.size());

	}

}










