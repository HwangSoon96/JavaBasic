public class TPC41 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (Exception e) {
			e.printStackTrace(); // ��� ���� �߻��� Ŭ���� ���� + ��� �߻��ߴ����� �˷��ִµ�
			System.out.println(e.toString()); // ��� ���� �߻��� Ŭ���� ������
		}
		
	}
	
	public static int divide(int i, int j) throws ArithmeticException { // throws Exception �ϰ� �Ǹ� �ش� �޼��带 ȣ���� �ʿ��� ���ܸ� ó���ϰԲ� ȣ���� ������ ������ ���ѱ�� ��.
																		// ���� Ŭ������, ���� Ŭ������, ... ���� ���� ���� ���� ����
		int k = i / j;
		return k;
	}
	
}
