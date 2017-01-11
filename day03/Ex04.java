class Ex04{

  public static void main(String[] args){
  //
  // 다음을 출력하시오
  // 
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
  int kor =100;
  int eng =100;
  int math=100;
  int tot=kor+eng+math;
  double avg = tot*100/3/100.0;
  /*
  char result='F';
  if(avg>=90){
    result='A';
  }else if(avg>=80){
    result='B';
  }else if(avg>=70){
    result='C';
  }else if(avg>=60){
    result='D';
  }
  
  int result=0;
  if(avg>=90){
    result=65;
  }else if(avg>=80){
    result=66;
  }else if(avg>=70){
    result=67;
  }else if(avg>=60){
    result=68;
  }else{
    result=70;
  }
  */
  int result=70;
  if(avg>=60){
    result-=2;
  }
  for(int i=70; i<=avg; i+=10){
    if(i!=100){
    result--;
    }
  }
  
  System.out.println("-------------------------------------------");
  System.out.println("\"국어\"\t영어\t수학\t총점\t평균\t학점");
  System.out.println("-------------------------------------------");
  System.out.print(kor);
  System.out.print("\t");
  System.out.print(eng);
  System.out.print("\t");
  System.out.print(math);
  System.out.print("\t");
  System.out.print(tot);
  System.out.print("\t");
  System.out.print(avg);
  System.out.print("\t");
  System.out.println((char)result);
  System.out.println("-------------------------------------------");
  
  }//main end

}//class end







