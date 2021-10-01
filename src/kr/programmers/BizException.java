package kr.programmers;

public class BizException extends RuntimeException { // Exception을 상속받으면 Checked Exception이 되며, 이 경우 예외처리를 반드시 해주어야 한다. 안 그러면 컴파일 오류 발생
													 // RuntimeExeption을 상속받으면 Unchecked Exception이 되며, 이 경우 예외처리를 하지 않아도 컴파일 오류 발생 X
	
	// 생성자 메서드
	public BizException(String msg) {
		super(msg); // 부모 생성자 메서드를 호출해서 오류 문자열을 넘겨줌
		}
	
	// 생성자 메서드
	public BizException(Exception ex) {
		super(ex); // 부모 생성자 메서드를 호출해서 예외가 발생한 클래스를 넘겨줌
	}

}
