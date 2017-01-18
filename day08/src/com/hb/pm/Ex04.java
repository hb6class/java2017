package com.hb.pm;

import java.util.Scanner;

class Factory{
	int water,sugar;
//	100->33*3 +1
//	200->100*2+0
	void add(int a, int b){
		water+=a;
		sugar+=b;
	}
	void del(int a, int b){
		water-=a;
		sugar-=b;
	}
	// ���̽�ũ��(1box) = ��(3����) + ����(2�׷�)
	int show(){
		int cnt=0;
		if(water/3>=sugar/2){
			cnt=sugar/2;
		}else{
			cnt=water/3;
		}
		System.out.println("���갡���� ����: "
						+cnt+"box");
		return cnt;
	}
	void delBox(int cnt){
		if(cnt<=show()){
			water-=cnt*3;
			sugar-=cnt*2;
		}else{
			System.out.println("���갡�ɼ����� �Ѿ����ϴ�");
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// �������� ���α׷�
		// ���̽�ũ�� ����(ver 1.0.0)
		// ���̽�ũ��(1box) = ��(3����) + ����(2�׷�)
		// 1.�԰� 2.��� 3.���갡�ɼ���(box) 4.���� 0.����
		// 1.�԰� -> 1.��:	2. ����:
		// 2.��� -> 1.��:	2. ����:
		// 3. -> 000box
		// 4.���� -> box
		Scanner sc = new Scanner(System.in);
		String input="";
		int num=0;
		int water=0;
		int sugar=0;
		System.out.println("���̽�ũ�� ����(ver 1.0.0)");
		Factory fac = new Factory();
		while(true){
			System.out.print("1.�԰� 2.��� 3.���갡�ɼ���(box) 4.���� 0.����>");
			input=sc.nextLine();
			num=Integer.parseInt(input);
			switch (num) {
			case 1:
				System.out.print("�� �԰�(��):");
				input=sc.nextLine();
				water=Integer.parseInt(input);
				System.out.print("���� �԰�(g):");
				input=sc.nextLine();
				sugar=Integer.parseInt(input);
				fac.add(water,sugar);
				break;
			case 2:
				System.out.print("�� ���(��):");
				input=sc.nextLine();
				water=Integer.parseInt(input);
				System.out.print("���� ���(g):");
				input=sc.nextLine();
				sugar=Integer.parseInt(input);
				fac.del(water,sugar);
				break;
			case 3:
				fac.show();
				break;
			case 4:
				System.out.print("���귮(box):");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				fac.delBox(num);
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	}

}















