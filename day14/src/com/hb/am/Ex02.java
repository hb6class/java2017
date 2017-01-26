package com.hb.am;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3.14;
		Double b=new Double(a);
		Double c=new Double("3.14");
		Double max=Double.MAX_VALUE;
		Double min=Double.MIN_VALUE;
		Double e=3.14;//오토래핑
		double g=b;//.doubleValue();//언래핑
		System.out.println(max);
		System.out.println(min);
		double d=5.0/0;
		System.out.println("무한유무:"+Double.isInfinite(d));
		System.out.println("NaN유무:"+Double.isNaN(0.0/0.0));
	}

}
