class Ex05{

  public static void main(String[] args){
  // Q1.1~10까지 중, 짝수만 출력하시오
  // 2 4 6 8 10
  
  // Q1-2. 1~10까지의 합계는?
  
  // Q2.이들의 합계를 구하세요
  // 2 4 6 8 10 합계:00
  
  // Q3.1~10까지 중, 짝수만 출력하시오
  // 2,4,6,8,10
  
  
  // Q4.1~55까지 중, 3의배수를 출력하시오
  // 3 6 9 12 ...
  
  // Q5.i는 1,2,3,4 ... 그 합이 100를 넘는 최초의 i값은?  
  
  //Q1.
    /*
    for(int i=2; i<=10; i+=2){
      System.out.print(i+" ");
    }
    
    for(int i=1; i<=10; i++){
      if(i%2==0){
        System.out.print(i);
      }else{
        System.out.print(" ");
      }
      // 홀수는 x, 짝수면 o
    }
    */
    System.out.println("-------------------");
    System.out.println("Q1.");
    /*
    for(int i=1; i<=5; i++){
      //System.out.print(i*2+" ");
      System.out.print(i+i+" ");
    }
    */
    for(int i=1; i<10; i++){
    i++;
    System.out.print(i+" ");
    }
    
    System.out.println("\n-------------------");
    System.out.println("Q1-2.1~10까지의 합계는?");
    //System.out.println(1+2+3+4+5+6+7+8+9+10);
    int sum=0;
    for(int i=1; i<=10; i++){
      sum+=i; // sum = sum+i;
    }
    System.out.println("합계는 "+sum);
    System.out.println("\n-------------------");
    System.out.println("Q2.");
    int sum2=0;
    for(int i=2; i<=10; i++){
      if(i%2==0){
      sum2+=i;
      System.out.print(i);
      }else{
      System.out.print(", ");
      }
      
    }
    System.out.println("합계는 "+sum2);
    System.out.println("\n-------------------");
    System.out.println("Q4.");
    for(int i=1; i<=55; i++){
      if(i%3==0){
        System.out.print(i+" ");
      }
      
    }
    System.out.println("\n-------------------");
    System.out.println("Q5.");
    int sum3=0;
    int temp=0;
    boolean result=true;
    for(int i=1;result;i++){
      
      if(sum3<=100){
        sum3+=i;
        temp=i;
        System.out.println(i+":"+sum3);
      }else{
        result=false;
      }
    }
    System.out.print("1~n까지 중 그합이 100을 ");
    System.out.println("넘는 최초의 n은 "+temp);
  }

}








