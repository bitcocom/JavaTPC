package kr.tpc;
// å(Object)->����, ����, ���ǻ�, ��������......
public class BookVO {
   public String title;
   public int price;
   public String company;
   public int page;
   // ����Ʈ�����ڸ޼���(����)
   public BookVO() {
	   // �ʱ�ȭ �۾�
	   this.title="�ڹ�";
	   this.price=14000;
	   this.company="������";
	   this.page=780;
   }
   // ������ �޼����� �ߺ�����(overloading)
   public BookVO(String title,int price,String company, int page) {
	   this.title=title;
	   this.price=price;
	   this.company=company;
	   this.page=page;	   
   }
}
