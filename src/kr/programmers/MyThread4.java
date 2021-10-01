package kr.programmers;

public class MyThread4 extends Thread {
	
	public int total;
	
	public void run() {
		synchronized (this) {
			for(int i = 1; i < 6; i++) {
				System.out.println(i + " ��(��) ���մϴ�.");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			notify(); // notify()�޼ҵ带 ȣ���ϸ� wait�ϰ� �ִ� �����带 ���� 
		}
	}
}
