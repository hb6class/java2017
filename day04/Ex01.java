class Ex01{

  public static void main(String[] args){
  // ���� 3���� ���ڸ� ������������ ����ϴ� 
  // ���α׷��� ����ÿ�
  
  // 7, 2, 5
  // 2<5<7
  int num1, num2, num3;
  num1=7;
  num2=20;
  num3=50;
  // ���� ���� ����
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