class Ex05{

  public static void main(String[] args){
  // Q1.1~10���� ��, ¦���� ����Ͻÿ�
  // 2 4 6 8 10
  
  // Q1-2. 1~10������ �հ��?
  
  // Q2.�̵��� �հ踦 ���ϼ���
  // 2 4 6 8 10 �հ�:00
  
  // Q3.1~10���� ��, ¦���� ����Ͻÿ�
  // 2,4,6,8,10
  
  
  // Q4.1~55���� ��, 3�ǹ���� ����Ͻÿ�
  // 3 6 9 12 ...
  
  // Q5.i�� 1,2,3,4 ... �� ���� 100�� �Ѵ� ������ i����?  
  
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
      // Ȧ���� x, ¦���� o
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
    System.out.println("Q1-2.1~10������ �հ��?");
    //System.out.println(1+2+3+4+5+6+7+8+9+10);
    int sum=0;
    for(int i=1; i<=10; i++){
      sum+=i; // sum = sum+i;
    }
    System.out.println("�հ�� "+sum);
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
    System.out.println("�հ�� "+sum2);
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
    System.out.print("1~n���� �� ������ 100�� ");
    System.out.println("�Ѵ� ������ n�� "+temp);
  }

}








