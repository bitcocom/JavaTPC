import kr.tpc.BookVO;

public class TPC12 {
	public static void main(String[] args) {
      // ������ -> ����+�ʱ�ȭ-> �ߺ�����
	  BookVO b1=new BookVO();
	  //b1.title="����Ŭ";
	  System.out.print(b1.title+"\t");
	  System.out.print(b1.price+"\t");
	  System.out.print(b1.company+"\t");
	  System.out.println(b1.page);
	  
	  BookVO b2=new BookVO();
	  System.out.print(b2.title+"\t");
	  System.out.print(b2.price+"\t");
	  System.out.print(b2.company+"\t");
	  System.out.println(b2.page);
	  
	  BookVO b3=new BookVO("Python", 18000, "�븲", 920);
	  System.out.print(b3.title+"\t");
	  System.out.print(b3.price+"\t");
	  System.out.print(b3.company+"\t");
	  System.out.println(b3.page);
	  
	}
}
