public class TPC04 {
	public static void main(String[] args) {
		// �����͸� �̵��϶�. (���� VS �迭)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a + b + c = ? �� �޼��� hap()���� ó���غ��ÿ�.
		hap(a, b, c); // �޼��� ȣ�� x = a, y = b, z = c
		
		int[] arr;
		arr = new int[3];
		// int[] arr = new int[3]; ���� �� �ٷ� ǥ�� ����
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap2(arr); // hap2�� arr�� ��°�� �Ѱܹ����� ó���Ѵ�.
		
	}
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	public static void hap2(int[] x) {
		// �迭�� ��°�� �޾����� �ݺ��� Ȱ���Ͽ� �̿� ����
		//int sum = x[0] + x[1] + x[2];
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
