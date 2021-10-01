import kr.programmers.MyThread1;

public class TPC60 {
	public static void main(String[] args) {
		
		// 쓰레드 -> 운영체제가 동시에 여러 프로그램을 실행하듯이, JVM에서도 동시에 여러 작업을 할때 쓰레드를 사용.
		// 1. Thread 클래스를 상속 받는 방법
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");
		
		// thread 동작 시, run() 메서드가 아닌 start() 메서드 사용해야 한다.
		t1.start(); // 원래 메인은 실행되고 있고, 거기에 t1이 동시 실행된다.
		t2.start(); // + t2 동시 실행
		
		System.out.println("main end !!!"); // 모든 쓰레드들이 종료 되어야지만 프로그램이 종료가 된다. -> 메인이 먼저 동작을 다 끝낼수도 있다.
		
	}
}
