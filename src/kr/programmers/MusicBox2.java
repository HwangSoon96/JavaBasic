package kr.programmers;

public class MusicBox2 {
	
	// 이렇게 synchronized 메서드에 추가하면 먼저 선점한 쓰레드가 제일 먼저 쓰고, 그 다음 쓰레드가 쓰고, ... 이런 식으로 간다.
	public synchronized void playMusicA () {
		for(int i =0; i < 10; i++) {
			System.out.println("신나는 음악!!!");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicB () {
		for(int i =0; i < 10; i++) {
			synchronized (this) { // synchronized를 메소드에 붙혀서 사용 할 경우, 메소드의 코드가 길어지면, 마지막에 대기하는 쓰레드가 너무 오래 기다리는 것을 막기 위해서
								  // 이렇게 synchronized 블록 이용해서 특정 부분만 동기화 시킬 수 있다.
				System.out.println("슬픈 음악ㅠㅠ");
			}
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// synchronized를 붙히지 않은 메소드는 다른 쓰레드들이 synchronized 메소드를 실행하면서 모니터링 락을 획득했다 하더라도, 그것과 상관없이 실행된다.
	public void playMusicC () {
		for(int i =0; i < 10; i++) {
			System.out.println("카페 음악~");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}