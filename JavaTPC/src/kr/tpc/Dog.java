package kr.tpc;
public class Dog extends Animal{ // eat() { ? }
  // �̸�, ����, �� : ��������
  // ������(override)
  public void eat() {
	  System.out.println("��ó���Դ�.");
  }
  public Dog() {
	  super();//new Animal();
  }
}
