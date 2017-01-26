package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a1=1;
		Byte a2=new Byte(a1);
		Byte a3=new Byte("1");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		short b1=1;
		Short b2=new Short(b1);
		Short b3=new Short("1");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		long c1=1111L;
		Long c2=new Long(1111L);
		Long c3=new Long("1111");
//		Long c4=new Long("1111L");
		System.out.println(c3);
		System.out.println("-----------------------------");
		float d1=3.14F;
		Float d2 = new Float(3.14);
		Float d3 = new Float(3.14F);
		Float d4 = new Float("3.14");
		Float d5 = new Float("3.14F");
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(Float.valueOf(3.14F));
		System.out.println(Float.valueOf("3.14"));
		System.out.println(Float.valueOf("3.14F"));
		System.out.println(Float.parseFloat("3.14")+0.05F);
		System.out.println(Double.parseDouble("3.14")+0.05);
		System.out.println(new Double(Double.parseDouble("3.14")+0.05).intValue());
		System.out.println(d5.intValue());
		System.out.println("-----------------------------");
		boolean e1=true;
		Boolean e2=new Boolean(true);
		Boolean e3=new Boolean("true");
		Boolean e4=new Boolean(Boolean.TRUE);
		System.out.println(e4);
		System.out.println(e4.booleanValue());
		
	}

}







