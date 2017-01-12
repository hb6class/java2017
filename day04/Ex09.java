class Ex09{

  public static void main(String[] args){
    //1/2 + 2/3 + 3/4 + 4/5 ...+99/100=?
    
    double sum=0;
    /*
    for(int i=1; i<100; i++){
      //System.out.print(i+"/"+(i+1));
      sum+=i/(i+1.0);
    }
    System.out.println("합계:"+sum);
    // 94.81262248236033
    */
    
    for(int i=2; i<=100; i++){
      sum+=(1-1.0/i);
    }
    System.out.println("합계:"+sum);
    
  }

}