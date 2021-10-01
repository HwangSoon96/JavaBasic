import kr.programmers.BizException;

public class TPC43 {
	public static void main(String[] args) {
		
		// ����� ���� Exception -> Exception�̳� Exception�� �ڽ� Ŭ�������� ��ӹ޾� ���� Ŭ����
		// -> ���ܰ� �߻����� �� �� �� ���������� �˱� ���� ���� ����� ���
		bizMethod(5);
		try {
			bizMethod(-3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void bizMethod(int i) throws BizException {
		System.out.println("���� �޼��� ����");
		
		if(i < 0) {
			throw new BizException("�Ű����� i�� 0 �̻��̾�� �մϴ�!");
		}
		
		System.out.println("���� �޼��� ����");
	}
	
}
