import kr.tpc.*;
public class TPC24 {
	public static void main(String[] args) {
      // 2. ������ �迭
	  // Dog, Cat ������ �迭�� �����Ͻÿ�?		
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
	private static void display(Animal[] ani) { // �������迭
		 for(int i=0;i<ani.length;i++) {
	    	  ani[i].eat();
	    	  if (ani[i] instanceof Cat) {
	    	     ((Cat)ani[i]).night();
	    	  }
	      }// for		
	}
}
