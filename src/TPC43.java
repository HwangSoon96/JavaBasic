import kr.programmers.BizException;

public class TPC43 {
	public static void main(String[] args) {
		
		// 사용자 정의 Exception -> Exception이나 Exception의 자식 클래스들을 상속받아 만든 클래스
		// -> 예외가 발생했을 때 좀 더 직관적으로 알기 위해 직접 만들어 사용
		bizMethod(5);
		try {
			bizMethod(-3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void bizMethod(int i) throws BizException {
		System.out.println("비즈 메서드 시작");
		
		if(i < 0) {
			throw new BizException("매개변수 i는 0 이상이어야 합니다!");
		}
		
		System.out.println("비즈 메서드 종료");
	}
	
}
