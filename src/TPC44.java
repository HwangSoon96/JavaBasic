public class TPC44 {
	public static void main(String[] args) {
		
		// StringBuffer�� �޼��� ü�̴�
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // ��Ʈ�� ���ۿ� �߰�
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello"); // �ڱ� �ڽ��� �����ϱ� ������ sb2�� sb3�� ���� ����
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString(); // �޼��� ü�̴�, �ڱ��ڽ��� �����Ͽ� ����ؼ� �ڽ��� �޼��带 ȣ���ϴ� ���
																								 // �׷��� ��� StringBuffer�� ���� �޼��� ��� ���� �� �ִ�.
		System.out.println(str2);
		
	}
}
