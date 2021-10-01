import kr.programmers.DaemonThread;

public class TPC66 {
	public static void main(String[] args) {
		
		// ����(Daemon)�̶� ���� �������� ���� ���н��迭�� �ü������ ��׶���� �����ϴ� ���α׷�
		// ���� ������� �ڹ����α׷��� ���� �� ��׶��忡�� Ư���� �۾��� ó���ϰ� �ϴ� �뵵�� �����.
		// ���� ������
		Thread t = new Thread(new DaemonThread());
		t.setDaemon(true); // �����忡 ���� ����
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���� �����尡 ����˴ϴ�! + ���� �����嵵 ���� ����˴ϴ�!"); // ���󾲷���� �Ϲ� ������(main ��)�� ��� ����Ǹ� ���������� ����ȴ�.
		
	}
}
