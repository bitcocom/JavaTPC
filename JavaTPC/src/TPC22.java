import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {

       // upcasting
	   // Cat ani=new Cat();
	   // Object ani=new Cat();
		Animal ani=new Cat(); //upcasting
		ani.eat(); // �����Ͻ���->Animal, �������->Dog
		
		//ani.night();
		//Cat c=(Cat)ani; // downcasting
		//c.night();
		((Cat)ani).night(); 
		
		ani=new Dog();
		ani.eat();
		// ������
		// ����Ŭ������ ����Ŭ�������� ������ �޼����� ���δٸ��� ���۽�Ű�� ���� 
		
		Object o=new Dog();
		//o.eat();
		((Dog)o).eat();
	}
}
