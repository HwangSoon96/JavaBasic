import java.lang.String; // java.lang.*�� �⺻���� import �Ǿ� �ִ�.

public class TPC34 {
	public static void main(String[] args) {
		
		// java.lang.String str = new java.lang.String("APPLE");
		String str = new String("APPLE");
		
		String v = str.toLowerCase(); // ���ڿ��� �ҹ��ڷ� ����
		System.out.println(v);
		System.out.println(str.charAt(3)); // ���ڿ��� 3�� �ε��� ����
		System.out.println(str.length());
		System.out.println(str.indexOf("PL")); // ���ڿ����� PL�� ������ ó�� �ε��� ��ȣ, 2
		System.out.println(str.indexOf("PX")); // PX�� �����Ƿ� -1 ���
		System.out.println(str.replaceAll("P", "X")); // ���ڿ����� P�� �� X�� �ٲ��
		
	}
}
