import kr.poly.*;

public class TPC27 {
	public static void main(String[] args) {
		
		// RemoCon r = new RemoCon(); // 인터페이스 단독으로 객체 생성 불가
		
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();
		
	}
}
