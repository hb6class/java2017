package com.hb.pm;


class LnkLst{
	Nodes node;
	
	class Nodes{
		String val;
		Nodes nxt;
	}
	
	public LnkLst() {
		node=new Nodes();
	}
	public void add(String st){
		Nodes tmp=node;
		while(tmp.nxt!=null){
			tmp=tmp.nxt;
		}
		tmp.nxt=new Nodes();
		tmp.val=st;
	}
	
	public int size(){
		int length=0;
		Nodes tmp=node;
		while(tmp.nxt!=null){
			length++;
			tmp=tmp.nxt;
		}
		return length;
	}
	
	public String get(int idx){
		String msg = null;
		Nodes tmp = node;
		for(int i=0; i<idx; i++){
			tmp=tmp.nxt;
		}
		msg= tmp.val;
//		node.val; 0
//		node.nxt.val;
//		node.nxt.nxt.val;
		return msg;
	}
}


public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LnkLst list = new LnkLst();
		list.add("첫번째");
		list.add("두번째");
//		list.add("세번째");
		System.out.println(list.size());
		System.out.println("end");
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
	}

}









