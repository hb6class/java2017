package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3.14;
		Double b=new Double(a);
		Double c=new Double("3.14");
		Double max=Double.MAX_VALUE;
		Double min=Double.MIN_VALUE;
		Double e=3.14;//���䷡��
		double g=b;//.doubleValue();//����
		System.out.println(max);
		System.out.println(min);
		double d=5.0/0;
		System.out.println("��������:"+Double.isInfinite(d));
		System.out.println("NaN����:"+Double.isNaN(0.0/0.0));
	}

}
