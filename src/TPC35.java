public class TPC35 {
	public static void main(String[] args) {
		
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		if(str1 == str2) { // heap area�� str1 & str2 ��ü�� ���� �ٸ� �޸� ������ �����Ǿ� �������� �ٸ��Ƿ� NO
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if(str1.equals(str2)) { // str1 & str2 ��ü�� ���� �ٸ� �޸� ������ �����Ǿ� �������� �ٸ��Ƿ� ������ ���Ϸ��� equlas �޼��� ��� �Ѵ�. YES
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if(str3 == str4) { // Literal Pool �̶�� ���ڿ� ����� �����Ǵ� �޸� ���������� ���� ������ ������ ��Ȱ���ϹǷ� ������ ����. YES
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if(str3.equals(str4)) { // ���ڿ��� ������ �ִ� ���� ���� ���� ������ equals �޼��� ���.
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
}
