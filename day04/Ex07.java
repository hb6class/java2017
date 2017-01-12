class Ex07{

  public static void main(String[] args){
  // Q2. 다음을 출력하시오
  // 1            -1
  // 1  2         -2
  // 1  2  3      -3
  // 1  2  3  4   -4
  // 합계 : 000
  /*
    for(int a=0; a<4; a++){
    
      for(int b=0; b<a+1; b++){
        System.out.print(b+1+"\t");
      }
      System.out.println();
    }
  */
  int sum=0;
  int cnt=1;
  int limit=1;
  for(int z=0; z<10; z++){
    System.out.print(cnt+"\t");
    sum+=cnt;
    if(cnt==limit){
      System.out.println();
      cnt=1;
      limit++;
    }else{
      cnt++;
    }
  }
  System.out.println("합계"+sum);
  /*
  for(int i=0; i<4; i++){
    for(int j=0; j<4; j++){
      if(j<i+1){
        System.out.print(j+1+"\t");
      }
    }
    System.out.println();
  }
  */
  }//main end

}//class end