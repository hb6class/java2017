class Ex08{

  public static void main(String[] args){
    //반지름*반지름×3.14
    int r=10;
    System.out.print("지름이 10cm인 원의 넓이는?");
    System.out.println(" "+(r*r*0.25)*3.14);
    System.out.println("------------------------");
    int tot=0;
    int cnt=1;
    while(cnt<11){
      System.out.print(cnt);
      tot+=cnt;
      if(cnt<10){
        System.out.print("+");
      }
      cnt++;
    }
    System.out.println("="+tot);
    System.out.println("------------------------");
    // *              1줄 1칸
    //    *           2줄 2칸
    //       *        3줄 3칸
    //          *     4줄 4칸
    
    int ch=97;
    for(int i=0; i<4; i++){
      for(int j=0; j<4; j++){
        if(j<4-(i+1)){
        System.out.print(' ');
        }else{
        System.out.print((char)(ch++));
        }
      }
      System.out.println();
    }
    System.out.println("------------------------");
    //   @ @ @ *  1줄 3칸부터  1줄 3칸까지 i=0 (4-(i+1))
    //   @ @ * *  2줄 2칸부터  2줄 2칸까지 i=1
    //   @ * * *  3줄 1칸부터  3줄 1칸까지 i=2
    //   * * * *  4줄 0칸부터  4줄 0칸까지 i=3
  }

}
















