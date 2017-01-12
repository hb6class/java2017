class Ex01{

  public static void main(String[] args){
  // 다음 3개의 숫자를 오름차순으로 출력하는 
  // 프로그램을 만드시오
  
  // 7, 2, 5
  // 2<5<7
  int num1, num2, num3;
  num1=7;
  num2=20;
  num3=50;
  // 가장 작은 조건
  /*
  if(num1<num2 && num2<num3 && num1<num3){//num1<num2<num3
    System.out.println(num1+"<"+num2+"<"+num3);
  }else if(num2<num1 && num2<num3 && num1<num3){//num2<num1<num3
    System.out.println(num2+"<"+num1+"<"+num3);
  }else if(num2<num3 && num2<num1 && num3<num1){//num2<num3<num1
    System.out.println(num2+"<"+num3+"<"+num1);
  }else if(num1<num3 && num1<num2 && num3<num2){//num1<num3<num2
    System.out.println(num1+"<"+num3+"<"+num2);
  }else if(num3<num2 && num3<num1 && num2<num1){//num3<num2<num1
    System.out.println(num3+"<"+num2+"<"+num1);
  }else if(num3<num1 && num3<num2 && num1<num2){//num3<num1<num2
    System.out.println(num3+"<"+num1+"<"+num2);
  }
  */
  if(num1<num2&&num1<num3){
    System.out.print(num1+"<");
    if(num2<num3){
      System.out.print(num2+"<"+num3);
    }else if(num3<num2){
      System.out.print(num3+"<"+num2);
    }
  }else if(num2<num1&&num2<num3){
    System.out.print(num2+"<");
    if(num1<num3){
      System.out.print(num1+"<"+num3);
    }else if(num3<num1){
      System.out.print(num3+"<"+num1);
    }
  }else if(num3<num1&&num3<num2){
    System.out.print(num3+"<");
    if(num1<num2){
      System.out.print(num1+"<"+num2);
    }else if(num2<num1){
      System.out.print(num2+"<"+num1);
    }
  }
  
  
  
  
  }//main end

}//class end