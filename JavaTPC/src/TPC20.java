import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;
public class TPC20 {
	public static void main(String[] args) {
     // Animal �θ�Ŭ������ ������� ����
	 Dog d=new Dog();
	 d.eat(); // ? -> ��ó���Դ�.

	 Cat c=new Cat();
	 c.eat();
	 c.night();
	 
	 // Dog.class, Cat.class
	 Animal ani=new Dog(); // upcasting(�ڵ�����ȯ)
	 ani.eat(); // ? -> ��ó���Դ�.
	 
	 ani=new Cat();
	 ani.eat(); // ? -> ����� ó���Դ�.
	 //ani.night();
	 ((Cat)ani).night(); // �㿡 ������ ���̳���. -->downcasting(��������ȯ)
	}
}
