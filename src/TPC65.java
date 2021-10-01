import kr.programmers.MyThread4;

public class TPC65 {
	public static void main(String[] args) {
		
		// 쓰레드와 상태제어(wait, notify)
		// wait와 notify는 동기화된 블록안에서 사용해야 한다. wait를 만나게 되면 해당 쓰레드는 해당 객체의 모니터링 락에 대한 권한을 가지고 있다면 모니터링 락의 권한을 놓고 대기한다.
		MyThread4 t4 = new MyThread4();
		t4.start();
		
		synchronized (t4) { // 동기화된 블록, 만약 이 부분보다 t4가 먼저 실행된다면 메인은 영원히 블록 상태에 있을듯
			try {
				System.out.println("t4가 완료될 때까지 기다립니다.");
				t4.wait(); // 이 부분이 t4를 멈추게 하는건지 아님 지금 이 블록 처리된 메인을 멈추게 하는건지 헷갈린다. 근데 아마 블록 처리된 메인을 멈추는 것 같다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Total is " + t4.total);
		
	}
}
