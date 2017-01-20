package com.hb.am;

class Car{
	String name;
}

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][][] arrss= new int[3][][];
		Car car1= new Car();
		Car car2= new Car();
		Car car3= new Car();
//		Car[] myCar=new Car[]{car1,car2,car3};
//		Car[] myCar={car1,car2,car3};
		Car[] myCar=new Car[3];
		myCar[0] = new Car();
		myCar[1] = new Car();
		myCar[2] = new Car();
		
		myCar[0].name="모닝";
		myCar[1].name="아반테";
		myCar[2].name="소나타";
		
		for(int i=0; i<myCar.length; i++){
			System.out.println(myCar[i].name);
		}
	}

}









