package kr.poly;
public class Dog extends Animal{ // eat() { ? }
  // �̸�, ����, �� : ��������
  // ������(override)
 
  public Dog() {
	  super();//new Animal();
  }
	@Override
	public void eat() {
		System.out.println("��ó�� �Դ�.");
	}   
}
