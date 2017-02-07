package com.hb.pm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gcal = new GregorianCalendar();
		System.out.println(gcal.get(Calendar.YEAR));
		System.out.println(gcal.isLeapYear(2016));
		System.out.println(gcal.isLeapYear(2017));
		System.out.println(gcal.isLeapYear(2018));
		System.out.println(gcal.isLeapYear(2019));
		System.out.println(gcal.isLeapYear(2020));
		System.out.println(gcal.isLeapYear(gcal.get(Calendar.YEAR)));
	}

}
