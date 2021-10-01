import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TPC49 {
	public static void main(String[] args) {
		
		// Map -> 키와 값으로 이루어진 자료구조, 키를 통해 값을 찾을 수 있음
		Map<String, String> map = new HashMap<>(); // Map도 인터페이스 이므로 객체 생성 불가 -> HashMap 클래스 활용.
		map.put("001", "choi");
		map.put("002", "yoon");
		map.put("003", "park");
		
		map.put("001", "yang"); // 같은 키로 값이 또 들어가면 새로 들어가는 값으로 바뀐다.
		
		System.out.println(map.size()); // 자료구조의 크기
		
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		
		Set<String> keys = map.keySet(); // 모든 key를 Set 형태로 뽑아준다.
		Iterator<String> iter = keys.iterator(); // keys.iterator()라는 메서드가 Iterator 타입의 객체를 반환하므로 new 쓸필요 없다. TPC47 예시 참조
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}
}
