class Ex03{

  public static void main(String[] args){
  
  // 조건문(만약 ~~이라면 ~해라)
  // if문
  // if(조건){ 조건이 true일때만 수행
  //    수행할 문장;
  //  }
  
  // if(조건){
  //  -> 조건이 true일 경우 실행할 문장
  // }else{
  //  -> 그렇지 않으면 수행할 문장(조건이 false)
  // }
  //
  // if(조건){
  //  -> 조건이 true일 경우 실행할 문장
  // }else if(조건){
  //  -> 두번째 조건이 참일 경우 수행
  // }else if(조건){
  //  -> 세번째 조건이 참일 경우 수행
  // .....
  // }else{
  //  -> 그렇지 않으면 수행할 문장(조건이 false)
  // }
  //
  // 음수 양수 0 판별
  int su=0;
  if(su>0){
    System.out.println(su+"은(는) 양수입니다");
  }else if(su>=0){
    System.out.println("0 입니다");
  }else{
    System.out.println(su+"은(는) 음수 입니다");
  }
  
  }//main end

}//class end







