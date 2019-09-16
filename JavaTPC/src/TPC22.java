import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {

       // upcasting
	   // Cat ani=new Cat();
	   // Object ani=new Cat();
		Animal ani=new Cat(); //upcasting
		ani.eat(); // 컴파일시점->Animal, 실행시점->Dog
		
		//ani.night();
		//Cat c=(Cat)ani; // downcasting
		//c.night();
		((Cat)ani).night(); 
		
		ani=new Dog();
		ani.eat();
		// 다형성
		// 상위클래스가 하위클래스에게 동일한 메세지로 서로다르게 동작시키는 원리 
		
		Object o=new Dog();
		//o.eat();
		((Dog)o).eat();
	}
}
