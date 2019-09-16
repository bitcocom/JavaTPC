import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {

		 A a=new A();
		 a.display();
		 //System.out.println(a.toString());
		 System.out.println(a); // Object-->toString() : kr.poly.A@279f2327
		 
		 Object o=new A(); // upcasting
		 ((A)o).display();
		 System.out.println(o.toString());
	}
}
