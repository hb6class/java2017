class Ex08{

  public static void main(String[] args){
  
    // ���ǹ�
    // switch(����){
    //  case ���ڿ��� :
    //      ������ ���;
    //      break;
    //  case ���ڿ��� :
    //      ������ ���;
    //      break;
    //  case ���ڿ��� :
    //      ������ ���;
    //      break;
    //  default :
    //      ������ ���;
    //  }
    char ch='��';
    switch(ch){
      case 'a':
      System.out.println("�����Դϴ�");
      //break;
      case '��':
      System.out.println("�ѱ��Դϴ�");
      //break;
      default :
      System.out.println("�����Դϴ�");
    }
    
  //  kor=90, eng=80, math=70
  // -------------------------------------------
  // ����   ����    ����    ����    ���  ����
  // -------------------------------------------
  //    90    80      70      000    80.00    B
  // -------------------------------------------
  //  ��� 90�̻� A
  //        80�̻� B
  //        70�̻� C
  //        60�̻� D
  //        60�̸� F
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
    System.out.println("����\t����\t����\t����\t���\t����");
    System.out.println("-------------------------------------------");
    System.out.println(kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"+result);
    System.out.println("-------------------------------------------");
    
  }

}