package kr.tpc;
// 책(Object) -> 제목, 가격, 출판사, 페이지 수, ...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 기본 생성자 메서드 생략되어 있음.
	// 기본 생성자 메서드와 같은 이름의 메서드가 하나라도 정의되어 있으면 기본 생성자 메서드는 생성 X.
	// 따라서 맨 아래 매개변수를 받는 생성자 메서드를 정의했다면 기본 생성자 메서드 역할을 하는 메서드도 직접 만들어주면 될듯.
	
	public BookVO() {
		// 생성자 메서드에서의 초기화 작업
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}
	
	// 생성자 메서드의 중복정의(overloading) -> 하나의 클래스 안에 이름이 같은 메서드가 여러개 존재하는 것. 정확히는 매개변수의 갯수가 다르거나 똑같아도 데이터 타입이 다른 것.
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
