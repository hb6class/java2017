class Ex01{

  public static void main(String[] args){
  // ���� �ڵ�
  System.out.println(); 
  // ()�ȿ� ������ �ܼ�â�� ����ϰ�
  // �����ض�
  System.out.println(1+2); 
  System.out.println(1.0+2.0);  
  System.out.println(1.0+2);
  
  int a,b;
  double c;
  a=100+10;
  b=a;
  c=3;
  b=(int)3.14;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  System.out.println("--------------------");
  int kor, eng, math, sum;
  kor=90;
  eng=80;
  math=65;
  sum=kor+eng+math;
  System.out.println("����:"+kor);
  System.out.println("����:"+eng);
  System.out.println("����:"+math);
  System.out.println("�հ�:"+sum);
  System.out.println("���:"+(int)(sum*100/3)/100.0);
  
  System.out.println("--------------------");
  
  char x;
  int z;
  x='A';
  x=(char)('A'+1);
  System.out.println(x);
  System.out.println("--------------------");
  System.out.println((int)'a');
  }

}







