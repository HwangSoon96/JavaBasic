public class TPC42 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException { // ���ܸ� �޼��� ȣ���� �ʿ� ������.
		if(j == 0) {
			// return 0; // �Լ��� ��� return�� ������ ����Ǳ� ������ k���� 0�� ����.
			throw new IllegalArgumentException("0���� ���� �� �����ϴ�."); // -> �̷� ���, � ���� 0���� ������ 0�� �ȴٴ� ���� �����ϱ� ������ ���� ������ �߻����� ���α׷��� ������� �� �� �ִ�.
		}
		int k = i / j;
		return k;
	}
		
}