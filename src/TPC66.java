import kr.programmers.DaemonThread;

public class TPC66 {
	public static void main(String[] args) {
		
		// 데몬(Daemon)이란 보통 리눅스와 같은 유닉스계열의 운영체제에서 백그라운드로 동작하는 프로그램
		// 데몬 쓰레드는 자바프로그램을 만들 때 백그라운드에서 특별한 작업을 처리하게 하는 용도로 만든다.
		// 데몬 쓰레드
		Thread t = new Thread(new DaemonThread());
		t.setDaemon(true); // 쓰레드에 데몬 설정
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("메인 쓰레드가 종료됩니다! + 데몬 쓰레드도 같이 종료됩니다!"); // 데몬쓰레드는 일반 쓰레드(main 등)가 모두 종료되면 강제적으로 종료된다.
		
	}
}
