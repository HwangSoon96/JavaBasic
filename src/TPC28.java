import kr.poly.*;

public class TPC28 {
	public static void main(String[] args) {
		
		// RemoCon���� TV Ŭ������ �����Ͻÿ�.
		
		RemoCon r = new TV();
		// TV ä�� 40�� �ø���
		for(int i = 0; i < 40; i++) {
			r.chUp();
		}
		// TV ä�� 40�� ������
		for(int i = 0; i < 40; i++) {
			r.chDown();
		}
		r.internet();

	}
}
