package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
//		�ֹι�ȣ�� �Է����ּ���> 990101-1234567
		
//		> �Է��Ͻ� ��ȣ�� 990101-1234567
//		����� 00�� �������� �����Դϴ�
//		����� 00�� �������� �̼������Դϴ�
		////////////////////////////////////////
//		�ֹι�ȣ�� �Է����ּ���> �������ϰ���-���̻�����ĥ
		
//		> �Է��Ͻ� ��ȣ�� 990101-��234567
//		����� 00�� �������� �����Դϴ�
//		����� 00�� �������� �̼������Դϴ�
		////////////////////////////////////////
//		{'0'~'9'}
//		{'��'~'��'}
		char[] pttn1= new char[10];
//		for(int i=0;i<pttn1.length; i++){
//			pttn1[i]=(char)('0'+i);
//		}
		pttn1=new char[]{'0','1','2','3','4','5','6','7','8','9'};
		char[] pttn2={'��','��','��','��','��','��','��','ĥ','��','��'};
		String input = "�������Ͽ���-���̻�����ĥ";
		
		boolean lng=chkLng(input);//���̰� 14�� �´���
		if(lng){
			for(int i=0; i<input.length(); i++){
				char ch=input.charAt(i);
				if(i==6){
					if(ch!='-'){
						System.out.println("[000000-0000000]���Ŀ� ���缭 �ۼ����ּ���");
						lng=false;
					}
					continue;
				}
				if(ch>='0'&&ch<='9'){}else{
//		pttn1=new char[]{'0','1','2','3','4','5','6','7','8','9'};
//		char[] pttn2={'��','��','��','��','��','��','��','ĥ','��','��'};
					int j=0;
					for(j=0; j<pttn2.length; j++){
						if(pttn2[j]==ch){break;}
					} 
					if(j==pttn2.length){
						System.out.println("�Է¿���");
						lng=false;
					}else{
						input=input.substring(0, i)
							+pttn1[j]+input.substring(i+1, input.length());
					}
				}
			}//for end
			if(lng){
				String msg="����� ";
				msg+=cntAge(input.charAt(0),input.charAt(1),input.charAt(7));
				msg+="�� "+gender(input.charAt(7))+"�ڷν� ";
				if(cntAge(input.charAt(0),input.charAt(1),input.charAt(7))>18){
					msg+="���� �Դϴ�";
				}else{
					msg+="�̼����� �Դϴ�";
				}
				System.out.println(msg);
			}
		}else{
			System.out.println("�Է±��� 14�� �Դϴ�");
		}
	}
	public static char gender(char a){
		if(a=='1'||a=='3'){
			return '��';
		}else if(a=='2'||a=='4'){
			return '��';
		}
			return 'x';
	}
	public static int cntAge(char a, char b, char c){
		int year=0;
		if(c=='1'||c=='2'){
			year=1900;
		}else if(c=='3'||c=='4'){
			year=2000;
		}
		int age = 2017 -(year+
				Integer.parseInt(String.valueOf(new char[]{a,b})))+1;
		
		return age;
	}
	public static boolean chkLng(String input){
		boolean lng=true;
		if(input.length()!=14){
			lng=false;
		}
		return lng;
	}

}




















