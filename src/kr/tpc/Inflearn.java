package kr.tpc;

public class Inflearn {
	
	private Inflearn() { // private 생성자를 사용하면 객체 생성을 막을 수 있다.
						//	= private 생성자를 가진 클래스의 모든 메서드는 static이어야 한다.
						// static과 non-static을 동시에 사용하려면 생성자 메서드를 public으로 하고 static 메서드는 클래스명.메서드명,
						// non-static 메서드는 객체 생성해서 사용하면 된다.
		
	}
	
	// 인스턴스 메서드
	public void tpc() {
		System.out.println("TPC 강의 너무 재미있다.");
	}
	// 클래스 메서드
	public static void java() {
		System.out.println("자바 강의 너무 재미있다.");
	}

}
