import java.util.ArrayList;
import java.util.List;

public class TPC48 {
	public static void main(String[] args) {
		
		// List는 길이가 가변적
		List<String> list = new ArrayList(); // List도 인터페이스 이므로 객체 생성 불가 -> ArrayList 클래스 활용.
		list.add("choi");
		list.add("yoon");
		list.add("choi");
		
		System.out.println(list.size()); // 자료구조의 크기, set과 달리 중복 가능 + 순서 있음.
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
