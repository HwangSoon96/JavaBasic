import kr.poly.*;

public class TPC27 {
	public static void main(String[] args) {
		
		// RemoCon r = new RemoCon(); // �������̽� �ܵ����� ��ü ���� �Ұ�
		
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
