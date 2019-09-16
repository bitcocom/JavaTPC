package kr.tpc;
public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자 메서드(생략)
	public BookDTO() {
		// 객체를 생성하는 작업한다.(기계어코드)
	}
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
