package com.hb.pm;

class Arrs extends Object{
	Object[] val;
	int length;
	public Arrs() {
		val=new Object[length];
	}
	public void del(int idx){
		length--;
		Object[] tmp=new Object[length];
		for(int i=0; i<idx; i++){
			tmp[i]=val[i];
		}
		for(int i=idx; i<tmp.length; i++){
			tmp[i]=val[i+1];
		}
		val=tmp;
	}
	
	public void add(Object a) {
		length++;
		Object[] tmp=new Object[length];
		// ���� ����
		for(int i=0; i<val.length; i++){
			tmp[i]=val[i];
		}
		// �߰�
		tmp[val.length]=a;
		// �ӽ� ������ �ʵ带 �ٲٱ�
		val=tmp;
	}
	public void add(int idx, Object tmpVal){
		length++;
		Object[] tmp=new Object[length];
		// ���� ����
		for(int i=0; i<idx; i++){
			tmp[i]=val[i];
		}
		for(int i=idx; i<val.length; i++){
			tmp[i+1]=val[i];
		}
		// �߰�
		tmp[idx]=tmpVal;
		// �ӽ� ������ �ʵ带 �ٲٱ�
		val=tmp;
	}
//	public int length(){
//		return val.length;
//	}
	
	public Object get(int a){
		return val[a];
	}
	
	@Override
	public String toString() {
		String msg="[";
		for(int i=0; i<val.length; i++){
			msg+=val[i]+" ";
		}
		return msg+"]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//�����Ҵ� -�迭(int)
		Arrs array= new Arrs();
		array.add("aaaaa");
		array.add("bbbbb");
		array.add("ccccc");
		System.out.println(array.toString());
		array.add(2,1234);
		System.out.println(array.toString());
		array.del(2);
		System.out.println(array.toString());
	}

}











