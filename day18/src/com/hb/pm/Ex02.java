package com.hb.pm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		// Queue && Stack
		Queue q1 = new LinkedList();
		q1.offer("첫째");//입력
		q1.offer("둘째");// 제일 뒤이어 추가
		q1.offer("셋째");
		q1.offer("넷째");
		System.out.println(q1.peek());
		System.out.println(q1.peek());//처음값을 반환
		System.out.println(q1.peek());
		System.out.println(q1.peek());
		System.out.println(q1.poll());//출력
		System.out.println(q1.poll());//처음값을 반환후 삭제
		System.out.println(q1.poll());
		System.out.println("-----------------------------------");
		Stack stk= new Stack();
		stk.push("첫번째");//입력
		stk.push("두번째");
		stk.push("세번째");
		stk.push("네번째");
		System.out.println(stk.peek());//
		System.out.println(stk.pop());//출력
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
	}

}
