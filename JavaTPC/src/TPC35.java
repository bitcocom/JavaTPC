public class TPC35 {
	public static void main(String[] args) {

		String str1=new String("APPLE");
		String str2=new String("APPLE");
		
		if(str1==str2) {
			System.out.println("YES");
		}else {
		    System.out.println("NO");// V	
		}
		
		if(str1.equals(str2)) {
			System.out.println("YES"); // V
		}else {
			System.out.println("NO");
		}
		//-------------------------------------------
		String str3="APPLE";
		String str4="APPLE";
		
		if(str3==str4) {
			System.out.println("YES"); // V
		}else {
		    System.out.println("NO");	
		}

		if(str3.equals(str4)) {
			System.out.println("YES"); // V
		}else {
			System.out.println("NO");
		}
	}
}
