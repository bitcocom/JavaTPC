package kr.poly;
import java.lang.*;
public class A extends Object {

	public A() {
		super();
	}
	
	public void display() {
		System.out.println("나는 A이다.");		
	}

	@Override
	public String toString() {
       return "재정의 메서드 입니다."; 
	}
	
}
