import kr.programmers.MyThread2;

public class TPC61 {
	public static void main(String[] args) {
		
		// 2. Runnable �������̽��� �����ϴ� ���
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
		
		// MyThread2�� Thread�� ��ӹ��� �ʾұ� ������ Thread�� �ƴ϶� start() �޼��尡 ����. -> Thread ��ü �����ؼ� start() �޼��� ���
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end !!!"); // �� ���� ��� �� �Ȱ���.
		
		// Thread Ŭ������ ��ӹ޴� ����� �� ������������ �ڹٴ� �⺻������ ���� ��Ӹ��� �����Ѵ�.
		// ���� �̹� �ٸ� Ŭ������ ��ӹް� �ִٸ� �̷��� �������̽��� �̿��ϴ� ����� �̿��ؾ� �Ѵ�.
		
	}
}
