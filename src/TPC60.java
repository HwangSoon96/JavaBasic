import kr.programmers.MyThread1;

public class TPC60 {
	public static void main(String[] args) {
		
		// ������ -> �ü���� ���ÿ� ���� ���α׷��� �����ϵ���, JVM������ ���ÿ� ���� �۾��� �Ҷ� �����带 ���.
		// 1. Thread Ŭ������ ��� �޴� ���
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		// thread ���� ��, run() �޼��尡 �ƴ� start() �޼��� ����ؾ� �Ѵ�.
		t1.start(); // ���� ������ ����ǰ� �ְ�, �ű⿡ t1�� ���� ����ȴ�.
		t2.start(); // + t2 ���� ����
		
		System.out.println("main end !!!"); // ��� ��������� ���� �Ǿ������ ���α׷��� ���ᰡ �ȴ�. -> ������ ���� ������ �� �������� �ִ�.
		
	}
}
