package com.hb.pm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		// Queue && Stack
		Queue q1 = new LinkedList();
		q1.offer("ù°");//�Է�
		q1.offer("��°");// ���� ���̾� �߰�
		q1.offer("��°");
		q1.offer("��°");
		System.out.println(q1.peek());
		System.out.println(q1.peek());//ó������ ��ȯ
		System.out.println(q1.peek());
		System.out.println(q1.peek());
		System.out.println(q1.poll());//���
		System.out.println(q1.poll());//ó������ ��ȯ�� ����
		System.out.println(q1.poll());
		System.out.println("-----------------------------------");
		Stack stk= new Stack();
		stk.push("ù��°");//�Է�
		stk.push("�ι�°");
		stk.push("����°");
		stk.push("�׹�°");
		System.out.println(stk.peek());//
		System.out.println(stk.pop());//���
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
	}

}
