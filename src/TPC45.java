public class TPC45 {
	public static void main(String[] args) {
		
		// �ݺ��� �ȿ����� String�� StringBuffer
		String str1 = "hello world";
		String str2= str1.substring(5); // 5��°���� �߶� �����´�
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString(); // ���� ���ڿ����� ���ϴ� ���� ���������� �����ϴ� ����, ��Ʈ������ �����ؼ� append �Ŀ� toString.
		System.out.println(str4);
		
		String str5 ="";
		for(int i = 0; i < 100; i++) {
			str5 = str5 + "*"; // �̷��� �ϰ� �Ǹ� �ݺ����� �ѹ� �������� StringBuffer ��ü�� �����Ǿ� append �Ǿ����� -> new ������ ���� ���ϼ��� �ӵ��� ��������.
							   // �ݺ��� �ȿ��� ���ڿ� �ٷ궧�� StringBuffer�� �ٷ�� ���� �� ȿ�������� ������ �����ؾ� �Ѵ�.
		}
		System.out.println(str5);
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			sb.append("*"); // ���� ������ ȿ�������� �Ϸ��� �켱 StringBuffer���� append�� �� ��Ű�� �� �������� toString �޼��带 �̿��Ͽ� ���ڿ��� �ٲ��� ����ϴ� ���� �� ȿ�����̴�.
		}
		String str6 = sb.toString();
		System.out.println(str6);
		
	}
}
