package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 기본 생성자 메서드가 생략되어 있다.
	public BookDTO() {
		// 객체를 생성하는 작업을 한다. (이 때 this도 같이 만들어진다.)
		super();
	}
	public BookDTO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
}
