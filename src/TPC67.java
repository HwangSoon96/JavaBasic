public class TPC67 {
	public static void main(String[] args) {
		
		// 인터페이스 중에서 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 한다.
		// 쓰레드를 만들때 사용하는 Runnable 인터페이스의 경우 run()메소드를 하나만 가지고 있다.
		// 람다식
		new Thread(new Runnable() { // 자바는 메서드만 매개변수로 전달할 방법 X -> 따라서 run() 메서드를 가지고 있는 Runnable 객체를 매개변수로 전달
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start(); // new Thread( ~~~ ) 괄호가 여기서 닫혔다.
		
		// ()->{ ..... } 부분이 람다식, 다른말로 익명 메소드
		// JVM은 Thread생성자를 보고 ()->{} 이 무엇인지 대상을 추론한다.
		// Thread생성자 api를 보면 Runnable인터페이스를 받아들이는 것을 알 수 있다.
		// JVM은 Thread 생성자가 Runnable 인터페이스를 구현한 것이 와야 하는 것을 알게 되고 람다식을 Runnable을 구현하는 객체로 자동으로 만들어서 매개변수로 넣어준다.
		// 위의 방식을 람다식으로 표현
		new Thread(()-> {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello Lambda");
				}
		}).start();
		
	}
}
