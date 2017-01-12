class Ex06{

  public static void main(String[] args){
  
  // Q1. 다음을 출력하시오
  // 1    2    3    4     5
  // 6    7    8    9     10
  // 11   12   13   14    15
  // 16   17   18   19    20
  // 합계 : 000
  /*
    int cnt=1;
    int tot=0;
    for(int m=0; m<4; m++){
    
      for(int n=0; n<5; n++){
        System.out.print(cnt+"\t");
        tot=tot+cnt++;
      }
      System.out.println();
      
    }
    System.out.println("합계:"+tot);
  */
  /*
    int sum=0;
    for(int a=1; a<=20; a++){
      System.out.print(a+"\t");
      sum=sum+a;
      if(a%5==0){System.out.println();}
    }
    System.out.println("합계는 "+sum);
  */
    int sum2=0;
    for(int x=0; x<4; x++){
    
      for(int y=1; y<6; y++){
        System.out.print(y+5*x+"\t");
        sum2=sum2+(y+5*x);
      }
      System.out.println();
    }
    System.out.println("합계:"+sum2);
  
  }//main end

}//class end












