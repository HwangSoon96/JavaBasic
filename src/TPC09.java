public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		// a + b =?
		//int v = sum(a, b); // sum �޼���� static�� �ƴ϶� �׳� ȣ�� �Ұ���
		TPC09 tpc = new TPC09(); // tpc ��� ������ heap area�� �ִ� TPC09 ��ü(static area�� �ִ� add �޼��� �ּ� ���� ����)�� ����Ŵ
		int v = tpc.sum(a, b);
		System.out.println(v);

	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
	
}