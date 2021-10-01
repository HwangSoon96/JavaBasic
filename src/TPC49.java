import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TPC49 {
	public static void main(String[] args) {
		
		// Map -> Ű�� ������ �̷���� �ڷᱸ��, Ű�� ���� ���� ã�� �� ����
		Map<String, String> map = new HashMap<>(); // Map�� �������̽� �̹Ƿ� ��ü ���� �Ұ� -> HashMap Ŭ���� Ȱ��.
		map.put("001", "choi");
		map.put("002", "yoon");
		map.put("003", "park");
		
		map.put("001", "yang"); // ���� Ű�� ���� �� ���� ���� ���� ������ �ٲ��.
		
		System.out.println(map.size()); // �ڷᱸ���� ũ��
		
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		
		Set<String> keys = map.keySet(); // ��� key�� Set ���·� �̾��ش�.
		Iterator<String> iter = keys.iterator(); // keys.iterator()��� �޼��尡 Iterator Ÿ���� ��ü�� ��ȯ�ϹǷ� new ���ʿ� ����. TPC47 ���� ����
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}
}
