import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TPC47 {
	public static void main(String[] args) {
		
		// �ڷᱸ��(�ڷḦ ������ �� �ִ� ����) Ŭ������ = �÷��� �����ӿ�ũ
		// Set -> �ߺ��� ����, ������ ���� �ڷᱸ��
		
		Set<String> set1 = new HashSet<>(); // Set�� �������̽��̹Ƿ� ��ü ���� �Ұ��� -> Set�� ������ HashSet Ŭ���� �̿�. List�� ArrayList�� ����� �����ε�
											// ���׸� �� ��, �� ����� �׳� ������� �Ǵµ�
		boolean flag1 = set1.add("choi"); // ���� ���� �����ϴ� ��� false ����
		boolean flag2 = set1.add("yoon");
		boolean flag3 = set1.add("choi");
		
		System.out.println(set1.size()); // �ڷᱸ���� ũ��, �ߺ����� ������� �����Ƿ� 2
		System.out.println(flag1); // true
		System.out.println(flag2); // true
		System.out.println(flag3); // false
		
		Iterator<String> iter = set1.iterator(); // set1.iterator()��� �޼��尡 Iterator Ÿ���� ��ü�� ��ȯ�ϹǷ� new ���ʿ� ����. �ؿ� ����.
//		class CodeRunner{
		
//		    public static HashSet<String>myfunc() {
//		        HashSet<String> ret = new HashSet<String>();
//		        return ret;
//		    }
		
//		    public static void main(String[] args){
//		        HashSet<String> val = myfunc();
//		    }
//		}
		while(iter.hasNext()) { // ���� ���� �����Ѵٸ� true, ���� ���ٸ� false
			String str = iter.next(); // ���� �ϳ� ������, ���� ���� �����Ѵ�.
			System.out.println(str);
		}
		
	}
}
