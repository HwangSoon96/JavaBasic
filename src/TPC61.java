import kr.programmers.MyThread2;

public class TPC61 {
	public static void main(String[] args) {
		
		// 2. Runnable 인터페이스를 구현하는 방법
		MyThread2 t1 = new MyThread2("*");
		MyThread2 t2 = new MyThread2("-");
		
		// MyThread2는 Thread를 상속받지 않았기 때문에 Thread가 아니라서 start() 메서드가 없다. -> Thread 객체 구현해서 start() 메서드 사용
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("main end !!!"); // 두 가지 방법 다 똑같다.
		
		// Thread 클래스를 상속받는 방법이 더 쉬워보이지만 자바는 기본적으로 단일 상속만을 지원한다.
		// 따라서 이미 다른 클래스를 상속받고 있다면 이렇게 인터페이스를 이용하는 방법을 이용해야 한다.
		
	}
}
