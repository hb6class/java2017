class Ex08{

  public static void main(String[] args){
    //������*��������3.14
    int r=10;
    System.out.print("������ 10cm�� ���� ���̴�?");
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
    // *              1�� 1ĭ
    //    *           2�� 2ĭ
    //       *        3�� 3ĭ
    //          *     4�� 4ĭ
    
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
    //   @ @ @ *  1�� 3ĭ����  1�� 3ĭ���� i=0 (4-(i+1))
    //   @ @ * *  2�� 2ĭ����  2�� 2ĭ���� i=1
    //   @ * * *  3�� 1ĭ����  3�� 1ĭ���� i=2
    //   * * * *  4�� 0ĭ����  4�� 0ĭ���� i=3
  }

}
















