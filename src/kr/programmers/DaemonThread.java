package kr.programmers;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("���� �����尡 �������Դϴ�..");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
				break; // ���� �߻� ��, ���� ������ ���������� �ϱ� ����
			}
		}
		
	}

}
