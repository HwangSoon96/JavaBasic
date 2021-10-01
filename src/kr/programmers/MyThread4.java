package kr.programmers;

public class MyThread4 extends Thread {
	
	public int total;
	
	public void run() {
		synchronized (this) {
			for(int i = 1; i < 6; i++) {
				System.out.println(i + " 을(를) 더합니다.");
				total += i;
				
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			notify(); // notify()메소드를 호출하면 wait하고 있는 쓰레드를 깨움 
		}
	}
}
