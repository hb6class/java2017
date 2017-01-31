package com.hb.am;
// ��� class class�� extends �θ�Ŭ������
// ���� �ϳ��� Ŭ������ ��Ӱ���
// ����� ��� - static, �ɹ��ʵ�, �ɹ��޼ҵ�(non-static)
// ����� ���(��ü) - �ɹ��ʵ�, �ɹ��޼ҵ�(non-static)

class Father{
	int money=3000;
	static int su1=200;
	void showMeTheMoney(){
		System.out.println(money+"��");
	}
}

class Son extends Father{ 
//	int money=700;
	void addMoney(int su){
		money+=su;
	}
	// �������̵� - �޼ҵ��� ������
	void showMeTheMoney(){
		System.out.println("��ӹ��� ���� "+super.money);
		System.out.println("���� ���� ��"+this.money);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father man = new Father();
		Son man2 = new Son();
		System.out.println(man.money);
		System.out.println(man2.money);
		man.showMeTheMoney();
		man2.showMeTheMoney();
		
	}

}
