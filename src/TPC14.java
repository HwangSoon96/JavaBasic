import kr.tpc.BookDTO;

public class TPC14 {
	public static void main(String[] args) {
        // 책 -> class (BookDTO) -> 객체 -> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890;
		
		BookDTO dto; // dto가 구체적으로 가리키는 것이 없으므로 object(객체) 라고 부른다.
		dto = new BookDTO(title, price, company, page); // dto가 가리키는 실체가 만들어졌으므로(객체 생성) Instance 라고 부른다.
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) { // 이렇게 dto는 다른 메서드나 클래스로 데이터를 이동시킬 때 쓴다.
		System.out.print(dto.title + "\t");
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.println(dto.page);
	} 
}
 