package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		// ����Ŭ����
//		int a=1;// �⺻�ڷ��� , �����ڷ���
//		Integer
		int a=100;
		Integer b = new Integer(a);
		Integer c = new Integer("100");
		
		int j = b.intValue()+c.intValue();//����->�⺻ ����->
		Integer d = j;	// ���䷡�� 
		
		Integer i = b+c;
		
		Integer m = c;
		int n =c.intValue();//����
		System.out.println(a);
		System.out.println(b.intValue());
		System.out.println(c);
		System.out.println(d);
		System.out.println(2+"�� 2����:"+Integer.toBinaryString(b));
		System.out.println(2+"�� 8����:"+Integer.toOctalString(b));
		System.out.println(2+"�� 16����:"+Integer.toHexString(b));
		System.out.println("int�ڷ����� �ִ밪�� "+(Integer.MAX_VALUE));
		System.out.println("int�ڷ����� �ִ밪�� "+(Integer.MIN_VALUE));
		System.out.println("int�ڷ����� ũ���"+(Integer.SIZE));
		System.out.println(b.equals(c));
		System.out.println(Integer.parseInt("1111")+1);
		System.out.println(b.doubleValue());
		
	}
}











