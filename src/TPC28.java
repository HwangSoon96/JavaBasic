import kr.poly.*;

public class TPC28 {
	public static void main(String[] args) {
		
		// RemoCon으로 TV 클래스를 구동하시오.
		
		RemoCon r = new TV();
		// TV 채널 40번 올리기
		for(int i = 0; i < 40; i++) {
			r.chUp();
		}
		// TV 채널 40번 내리기
		for(int i = 0; i < 40; i++) {
			r.chDown();
		}
		r.internet();

	}
}
