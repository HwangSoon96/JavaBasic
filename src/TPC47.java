import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TPC47 {
	public static void main(String[] args) {
		
		// 자료구조(자료를 저장할 수 있는 구조) 클래스들 = 컬렉션 프레임워크
		// Set -> 중복이 없고, 순서도 없는 자료구조
		
		Set<String> set1 = new HashSet<>(); // Set은 인터페이스이므로 객체 생성 불가능 -> Set을 구현한 HashSet 클래스 이용. List와 ArrayList도 비슷한 원리인듯
											// 제네릭 쓸 때, 뒤 꺽쇠는 그냥 비워놔도 되는듯
		boolean flag1 = set1.add("choi"); // 같은 값이 존재하는 경우 false 리턴
		boolean flag2 = set1.add("yoon");
		boolean flag3 = set1.add("choi");
		
		System.out.println(set1.size()); // 자료구조의 크기, 중복값은 허용하지 않으므로 2
		System.out.println(flag1); // true
		System.out.println(flag2); // true
		System.out.println(flag3); // false
		
		Iterator<String> iter = set1.iterator(); // set1.iterator()라는 메서드가 Iterator 타입의 객체를 반환하므로 new 쓸필요 없다. 밑에 예시.
//		class CodeRunner{
		
//		    public static HashSet<String>myfunc() {
//		        HashSet<String> ret = new HashSet<String>();
//		        return ret;
//		    }
		
//		    public static void main(String[] args){
//		        HashSet<String> val = myfunc();
//		    }
//		}
		while(iter.hasNext()) { // 만약 값이 존재한다면 true, 값이 없다면 false
			String str = iter.next(); // 값을 하나 꺼내고, 다음 값을 지정한다.
			System.out.println(str);
		}
		
	}
}
