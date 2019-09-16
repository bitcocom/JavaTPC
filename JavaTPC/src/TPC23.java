import kr.tpc.*;
public class TPC23 {
	public static void main(String[] args) {
       // 1. 다형성인수
		Dog d=new Dog();
		display(d);
		Cat c=new Cat();
		display(c);

	} //                               upcasting
	private static void display(Animal r) { // 다형성인수
			r.eat();
			//r.night();
			if( r instanceof Cat) {
			    ((Cat)r).night(); // downcasting
			}
	}	
}
