import kr.tpc.*;
public class TPC30 {
	public static void main(String[] args) {
      // A, B Ŭ������ ������ �迭
	  Object[] o=new Object[2]; // �������迭
	  o[0]=new A();
	  o[1]=new B();
	  
	  for(int i=0;i<o.length;i++) {
		  if(o[i] instanceof A) {
			  ((A)o[i]).go();
		  }else {
			  ((B)o[i]).go();
		  }		  
	  }
	  printGo(o);
	}
	private static void printGo(Object[] o) {
		 for(int i=0;i<o.length;i++) {
			  if(o[i] instanceof A) {
				  ((A)o[i]).go();
			  }else {
				  ((B)o[i]).go();
			  }		  
		  }
	}
}
