package kr.programmers;

public class DaemonThread implements Runnable {

	@Override
	public void run() {
		
		while(true) {
			System.out.println("데몬 쓰레드가 실행중입니다..");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
				break; // 예외 발생 시, 무한 루프를 빠져나가야 하기 때문
			}
		}
		
	}

}
