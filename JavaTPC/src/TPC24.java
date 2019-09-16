import kr.tpc.*;
public class TPC24 {
	public static void main(String[] args) {
      // 2. 다형성 배열
	  // Dog, Cat 저장할 배열을 생성하시오?		
      Animal[] ani=new Animal[2];
      ani[0]=new Dog();
      ani[1]=new Cat();
      
      for(int i=0;i<ani.length;i++) {
    	  ani[i].eat();
    	  if (ani[i] instanceof Cat) {
    	     ((Cat)ani[i]).night();
    	  }
      }// for      
      display(ani);      
	}
	private static void display(Animal[] ani) { // 다형성배열
		 for(int i=0;i<ani.length;i++) {
	    	  ani[i].eat();
	    	  if (ani[i] instanceof Cat) {
	    	     ((Cat)ani[i]).night();
	    	  }
	      }// for		
	}
}
