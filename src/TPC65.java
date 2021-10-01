import kr.programmers.MyThread4;

public class TPC65 {
	public static void main(String[] args) {
		
		// ������� ��������(wait, notify)
		// wait�� notify�� ����ȭ�� ��Ͼȿ��� ����ؾ� �Ѵ�. wait�� ������ �Ǹ� �ش� ������� �ش� ��ü�� ����͸� ���� ���� ������ ������ �ִٸ� ����͸� ���� ������ ���� ����Ѵ�.
		MyThread4 t4 = new MyThread4();
		t4.start();
		
		synchronized (t4) { // ����ȭ�� ���, ���� �� �κк��� t4�� ���� ����ȴٸ� ������ ������ ��� ���¿� ������
			try {
				System.out.println("t4�� �Ϸ�� ������ ��ٸ��ϴ�.");
				t4.wait(); // �� �κ��� t4�� ���߰� �ϴ°��� �ƴ� ���� �� ��� ó���� ������ ���߰� �ϴ°��� �򰥸���. �ٵ� �Ƹ� ��� ó���� ������ ���ߴ� �� ����.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Total is " + t4.total);
		
	}
}
