import kr.tpc.BookDTO;
public class TPC13 {
	public static void main(String[] args) {
      // å->class(BookDTO)->��ü->�ν��Ͻ�
	  String title="������";
	  int price=25000;
	  String company="������";
	  int page=890;
	  
	  BookDTO dto; // dto(Object: ��ü)
	  dto=new BookDTO(title, price, company, page); // dto(Instance:�ν��Ͻ�)
	  
	  bookPrint(dto);  

	}	
	public static void bookPrint(BookDTO  dto) {
		System.out.print(dto.title+"\t");		
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.print(dto.page+"\t");
	}
}
