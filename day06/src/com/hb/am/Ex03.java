package com.hb.am;

public class Ex03 {
	// java (.class�� ���ϸ�)
	// class ���ϸ� -> main()���� -> ����
	// class ���ϸ� -> main()���� -> �޼ҵ�ȣ��
	//				-> �޼ҵ�()���� -> main() -> ����
	

	public static void main(String[] args) {
		// �޼ҵ�
		// �ڷ���(return value�� �ڷ���) �޼ҵ��(����){}
		System.out.println();
		int a=0;
		func01();
		for(int i=0; i<=5; i++){
			if(i==3){
//				return;
//				break;
				continue;
			}
			System.out.println("i="+i);
		}
		func02();
		return;
	}
	public static void func02(){
		System.out.println("func02() run");
		for(int i=1; i<=10; i++){
//			if(i%2==0){System.out.println(i);}
			if(i%2==1){continue;}
			System.out.println(i);
		}
		return;
	}
	
	public static int func01(){
		System.out.println("func01() run");
		return 0;
	}
	

}
