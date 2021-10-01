import java.util.*;
import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		// ArrayList list = new ArrayList();
		List<BookDTO> list = new ArrayList<BookDTO>(1); // List가 부모 클래스 이므로 이렇게도 선언 가능, 길이 1로 설정해도 들어오는 값에 따라 자동으로 늘어난다.
														// 타입 뒤에 <타입> 적으면 Object 배열이라도 그 타입만 받을 수 있다.
														// Object[] --> BookDTO[]
		
		list.add(new BookDTO("자바", 12000, "이지스", 600)); // Object 클래스로 받는거라 서로 다른 클래스를 다 받을 수 있다.
		list.add(new BookDTO("C언어", 17000, "에이콘", 700)); // 그러나 실무에서는 한 종류로만 받도록 설계해야 한다. 그래야 안전 (제네릭)
		list.add(new BookDTO("Python", 15000, "제이펍", 690));
		
		for(int i = 0; i < list.size(); i++) {
			// BookDTO vo = (BookDTO)list.get(i); // downcasting 한줄 표현
			Object o = list.get(i);
			BookDTO vo = (BookDTO)o;
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			// BookDTO vo = (BookDTO)list.get(i); // downcasting 한줄 표현
			
			// Object o = list.get(i);
			// BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i); // 제네릭 사용하면 downcasting이 필요없다.
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
		
	}
}
