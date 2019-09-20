//import java.lang.*;
public class TPC34 {
	public static void main(String[] args) {
      // String                012345.... index
		String str=new String("APPLE");
		String v=str.toLowerCase();
		System.out.println(v); // apple
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // -1
		System.out.println(str.replaceAll("P", "X")); // AXXLE
	}
}
