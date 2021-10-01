public class TPC39 {
	public static void main(String[] args) {
		
		int a = 1; // �⺻�� Ÿ��, ��ü X
		Integer b = new Integer(1); // �̰� ���������� �ڹ� ���� 9���ʹ� �� ���� ������ ������ �ٲ��
		// Integer b2 = 1; // �̷��� ���� �� �� �׾�����. �����Ϸ��� 1�� Integer�� �˾Ƽ� ��ȯ���ش�. (boxing)
		a = b; // ������ b.intValue() �޼���� �⺻������ ���� �����ؾ� ������ �̰͵� �����Ϸ��� �˾Ƽ� b�� int ������ ��ȯ���ش�. (unboxing)
		System.out.println(b.intValue()); // 1
		System.out.println(b.toString()); // "1"
		
		System.out.println();
		
		Object[] obj = new Object[3];
		// obj[0] = 1; // boxing
		// obj[1] = 2; // ��ҿ��� �̷��� ���� �ȴ�.
		// obj[2] = 3;
		obj[0] = new Integer(1); // Object ��ü�� int �⺻�ڷ����� ���� ���� �޶� ��� ���谡 �������� �ʴ´�. �׷��� Object�� Integer�� ��ü�� ��ü ���̹Ƿ� ��� ���� ���� (����)
		obj[1] = new Integer(2);
		obj[2] = new Integer(3);
		
		System.out.println(obj[0].toString()); // �����ǿ� ���� �ڽ��� toString()�� ����ȴ�. 
		System.out.println(obj[1].toString());
		System.out.println(obj[2]); // toStirng() ���� ����]
		
		System.out.println();
		
		// "100" + "100" = 200
		String x = "100";
		String y = "100";
		// System.out.println(x + y); // 100100
		int v1 = Integer.parseInt(x); // ���ڿ� ���ڸ� int ������ ��ȯ
		int v2 = Integer.parseInt(y);
		System.out.println(v1 + v2);
		
		System.out.println();
		
		// 100 + 100 = "100100"
		String s1 = String.valueOf(v1); // int ���� ���ڿ��� ��ȯ
		String s2 = String.valueOf(v2);
		System.out.println(s1 + s2);
		
		// "100" + 100 = "100100" int���� ���ڿ��� ���ϸ� int���� �ڵ����� ���ڿ��� ����ȯ �ȴ�.
		System.out.println(x + v1);
		
	}
}
