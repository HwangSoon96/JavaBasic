import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a = 10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오.
		Book b; // 제목, 저자, 가격 등의 정보를 저장할 수 있는 연속된 공간(객체)을 설계해야 함 -> class(설계 도구)
		b = new Book(); // 객체 생성(메모리 어딘가에 객체를 생성), b는 객체변수 또는 인스턴스(실체)변수
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);
		System.out.println(b); // 얘는 메모리 주소 나오는건가
		
		PersonVO p;
		p = new PersonVO();
		p.name = "박매일";
		p.age = 40;
		p.weight = 68.4f;
		p.height = 175.7f;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.weight + "\t");
		System.out.println(p.height);
		
	}
}
