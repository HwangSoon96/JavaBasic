public class TPC08 {
	public static void main(String[] args) { // static�� �־�� �޸𸮿� �ε� �Ǳ� ������ ������ ������ static�� ������ �־�� �Ѵ�.
		int a = 30;
		int b = 50;
		int v = add(a, b); // static method�� call(ȣ��)
		System.out.println(v);

	}
	
	public static int add(int a, int b) { // static -> ���α׷��� ����Ǳ� ���� �޸��� ������ ��ġ�� �޼���(���� �ڵ�)�� �ڵ����� �ε� �����ִ� ����
		int sum = a + b;
		return sum;
	}
	
}
