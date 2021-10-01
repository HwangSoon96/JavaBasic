public class TPC06 {
	public static void main(String[] args) { // ���ε� ���α׷��� ������ ����ϴ� �ϳ��� �ż���
		// �޼���� ������ ����
		// �޼��� -> ����(method), ���(function)
		int a = 67;
		int b = 98;
		// a + b = ?
		int result = sum(a, b); // �޼��� ȣ��, ������ static�̹Ƿ� �޼��� ȣ���� �Ϸ��� ȣ���Ϸ��� �޼��嵵 static�̾�� �ٷ� ȣ�� ����.
		System.out.println(result);
		
		int[] arr= makeArr(); // 10, 20, 30�� ��� �迭
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);

	}
	// ���� 2���� �Ű������� �޾� ���ؼ� ������ ���ϰ� �����ϴ� �޼��带 �����Ͻÿ�.
	public static int sum(int a, int b) { // �Ű����� ���ޱ��(Call by Value, ���� ����), �޼��尡 static���� �޸𸮿� �ö� �־�� ���ο��� �ٷ� �޼��� ȣ���� �����ϴ�.
		int v = a + b;
		return v; // ���ϰ��� �޼��� �̸��� ��� �ϳ��� ���·� �ٽ� �������ش� -> �޼��嵵 ������ ����ó�� ������ �� �ִ�.
	}
	// 10 20 30�� �ѹ��� �����ϰ� ���� ���
	public static int[] makeArr() { // �迭 ���·� ���� �ϹǷ� int[] ����� �Ѵ�.
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
		return arr; // �ϳ��� ���¸� ���� �����ϹǷ� �迭 ���·� ���� �������ش�.
	}
}
