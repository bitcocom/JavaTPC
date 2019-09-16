package kr.poly;
public class Dog extends Animal{ // eat() { ? }
  // 이름, 나이, 종 : 상태정보
  // 재정의(override)
 
  public Dog() {
	  super();//new Animal();
  }
	@Override
	public void eat() {
		System.out.println("객처럼 먹다.");
	}   
}
