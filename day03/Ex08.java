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
    
    
  }

}