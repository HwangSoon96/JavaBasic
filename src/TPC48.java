import java.util.ArrayList;
import java.util.List;

public class TPC48 {
	public static void main(String[] args) {
		
		// List�� ���̰� ������
		List<String> list = new ArrayList(); // List�� �������̽� �̹Ƿ� ��ü ���� �Ұ� -> ArrayList Ŭ���� Ȱ��.
		list.add("choi");
		list.add("yoon");
		list.add("choi");
		
		System.out.println(list.size()); // �ڷᱸ���� ũ��, set�� �޸� �ߺ� ���� + ���� ����.
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
