public class TPC02 {
	public static void main(String[] args) {
		// ���α׷����� 3�� ��� : ����, �ڷ���(DataType), �Ҵ�(=)
		// 1 + 1 = 2 �� ����ϴ� ���α׷�
		int a, b, c; // 3���� ������ int������ ���� 
					 // -> �޸��� ��� ������ a, b, c�� int���� �°� ũ��� ������ ����
		a = 1;
		b = 1;
		c = a + b;
		System.out.println(c);
		
		float f;
		f = 34.5f; // �ڹٴ� �⺻������ �Ǽ��� double�� �����ϱ� ������ float ���� �ڿ� f �ٿ���� �Ѵ�
		System.out.println(f);
		
		char d;
		d = 'A'; // ��������ǥ�� ����, ū����ǥ�� ���ڿ�
		System.out.println(d);
		
		boolean g;
		g = true;
		System.out.println(g);
		
		// PDT(primitive data type) �⺻ �ڷ��� : �⺻������ �ڹ� �����Ϸ����� �������ִ� �ڷ���
		
		// Book bk; <- å����, ����, ���ǻ� ���� ������ ���� å�̶�� �ڷ���
		
		// UDDT(user define data type) ����� ���� �ڷ��� : ����ڰ� ������ �ڷ���
	}
}