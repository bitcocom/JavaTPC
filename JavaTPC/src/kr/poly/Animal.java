package kr.poly;
public abstract class Animal{ // �߻�Ŭ����(�ҿ�����, ��ְ�ü)-->Animal ani=new Animal(); X
	// Dog, Cat -->eat()
	public abstract void eat(); // �߻�޼���=>�ҿ����Ѹ޼���,��ָ޼���
	public void move() { // �����޼���
		System.out.println("������ ��� �̵��Ѵ�.");
	}	
}
