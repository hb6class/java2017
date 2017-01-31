package com.hb.am;

class Node{
	Node nxt;
	int val;
}

class nlist{
	Node node;
	private Node tmp;
	
	public nlist() {
		node=null;
	}
	
	void add(int a){
		if(node==null){
			node=new Node();
			node.val=a;
		}else{
			while(node.nxt!=null){
				tmp=node.nxt;
				
			}
		}
	}
	
}


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
