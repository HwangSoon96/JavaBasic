public class TPC40 {
	public static void main(String[] args) {
		
		// ���� ó�� -> ���α׷� ���� �� ����ġ ���� ��Ȳ(����)�� �̸� �����ϰ�, ó�� �ϴ� ��
		int i = 10;
		int j = 5;
		int k = i / j;
		System.out.println(k); // 2
		
		i = 10;
		j = 0;
		// k = i / j; // java.lang.ArithmeticException �߻� -> ���ܰ� �߻��ϸ� ���α׷��� ������ ������� �ʰ� �ٷ� ����ȴ�.
		// System.out.println(k); // ���� �߻����� ���� X
		// System.out.println("Main End!!"); // ���� �߻����� ���� X
		
		i = 10;
		j = 0;
		try {
			k = i / j; // ���ܰ� �߻��� �� ���� �ڵ����� try ���� �ȿ� �ִ´�.
		} catch (ArithmeticException e) { // catch(���ܰ� �߻��� Ŭ������? + ����(e)) �ϸ� �ش� ���� �߻� �� catch ���� �ȿ� �ִ� �ڵ����� �����Ѵ�.
			// catch(Exception e) -> Exception Ŭ������ ��� ���� Ŭ�������� ��� �����Ƿ� �̷��� �θ� ��� ���� ó�� ����
			// try �������� ���� ���� ���ܰ� �߻��Ѵٸ� catch ���� ������ ����ؼ� ������ ���� ó�� ����
			System.out.println("0���� ���� �� �����ϴ�. " + e.toString());
		} finally {
			System.out.println("finally�� ������ �߻��ߵ� �߻����� �ʾҵ� ������ ����");
		}
		System.out.println("Main End!!");
	}
}