package kr.programmers;

public class MyThread2 implements Runnable { // Runnable 인터페이스 구현
	
	private String str;
	
	// 생성자 메서드
	public MyThread2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		
		for(int i =0; i < 10; i++) {
			System.out.print(str);
			try {
				Thread.sleep((int)(Math.random() * 100));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
