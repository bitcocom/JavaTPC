import kr.poly.*;
public class TPC25 {
	public static void main(String[] args) {
        // eat() ---override----> eat()
		// Animal a=new Animal();
		// a.eat();
		// upcasting으로 활용(부모의 억할)
		Animal ani=new Dog();
		ani.eat();
	    ani.move();
		
		ani=new Cat();
		ani.eat();
		((Cat)ani).night();
		ani.move();

	}
}
