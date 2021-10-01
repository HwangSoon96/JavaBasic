package kr.programmers;

public class MyThread1 extends Thread { // 쓰레드를 사용하는 첫번째 방법 -> Thread 클래스를 상속

	private String str;
	
	//생성자 메서드
	public MyThread1(String str) {
		this.str = str;
	}	
	
	// + run 메서드를 overriding (재정의)
	@Override
	public void run() { // 다른 흐름의 메인 메서드 같은 느낌?
		
		// 여기에 실행시킬 작업 넣어놓으면 된다.
		for(int i = 0; i < 10; i++) {
			System.out.print(str);
			try {
				Thread.sleep((int)(Math.random() * 1000)); // Math.random() -> 0과 1.0 사이 값 랜덤하게 나온다. 그럼 1000이 1초니까 0.x 초 랜덤하게 쉴듯
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
