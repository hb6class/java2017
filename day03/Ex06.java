class Ex06{

  public static void main(String[] args){
    // while반복문
    //  while(조건){
    //    명령문;
    //  }
    // 
    int i=5;              // 초기값
    while(i<5){           // 조건
      
      System.out.println("hello java"+i);
      i++;                 // 증감식
    }
    System.out.println("\n---------------------------");
    System.out.println("Q1.");
    int num1=2; //초기값
    
    while(num1<=10){  //조건
      System.out.print(num1+" ");
      num1+=2;  //증감
    }
    System.out.println("\n---------------------------");
    System.out.println("Q1-2.");
    int num2=1;
    int sum1=0;
    while(num2<=10){
      sum1+=num2;
      num2++;
    }
    System.out.println("1~10합계는 "+sum1);
    System.out.println("\n---------------------------");
    System.out.println("Q4.");
    int sum2, num3;
    sum2=0;
    num3=1;
    
    while(num3<=55){
      if(num3%3==0){
      System.out.print(num3);
      sum2+=num3;
      }else if(num3%3==2 && num3!=2){
      System.out.print("+");
      }
      num3++;
    }
    System.out.println("="+sum2);
  }


}









