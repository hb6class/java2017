class Ex08{

  public static void main(String[] args){
  
    // 조건문
    // switch(인자){
    //  case 인자예상값 :
    //      수행할 명령;
    //      break;
    //  case 인자예상값 :
    //      수행할 명령;
    //      break;
    //  case 인자예상값 :
    //      수행할 명령;
    //      break;
    //  default :
    //      수행할 명령;
    //  }
    char ch='가';
    switch(ch){
      case 'a':
      System.out.println("영문입니다");
      //break;
      case '가':
      System.out.println("한글입니다");
      //break;
      default :
      System.out.println("문자입니다");
    }
    
  //  kor=90, eng=80, math=70
  // -------------------------------------------
  // 국어   영어    수학    총점    평균  학점
  // -------------------------------------------
  //    90    80      70      000    80.00    B
  // -------------------------------------------
  //  평균 90이상 A
  //        80이상 B
  //        70이상 C
  //        60이상 D
  //        60미만 F
  int kor, eng, math, tot;
  double avg;
  char result;
  kor=99;
  eng=100;
  math=100;
  tot=kor+eng+math;
  avg=tot*100/3/100.0;
  result ='F';
  switch((int)(avg/10)){
  case 10:
  case 9:
    result='A';
    break;
  case 8:
    result='B';
    break;
  case 7:
    result='C';
    break;
  case 6:
    result='D';
    break;
  }
  
    System.out.println("-------------------------------------------");
    System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
    System.out.println("-------------------------------------------");
    System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+result);
    System.out.println("-------------------------------------------");
    
  }

}