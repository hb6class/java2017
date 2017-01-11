class Ex02{

  public static void main(String[] args){
  // 정수형
  long num1;
  num1 = 2147483648L;
  
  System.out.println(num1);
  // 실수형
  float num2;
  num2=2147483648L;
  System.out.println(num2);
  
  int num3;
  num3=(int)3.14f;
  System.out.println(num3);
  // 정수형
  byte num4, temp;
  short num5;
  num4 = 126;       //-128~127
  temp=1;
  num5 = 200;
  System.out.println("num4:"+num4);
  System.out.println(num5);
  num4++; // num4=num4+1;
  System.out.println("num4:"+num4);
  num4++;
  System.out.println("num4:"+num4);
  
  
  }
  
  
}





