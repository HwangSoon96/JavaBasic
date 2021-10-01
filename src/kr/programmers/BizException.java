package kr.programmers;

public class BizException extends RuntimeException { // Exception�� ��ӹ����� Checked Exception�� �Ǹ�, �� ��� ����ó���� �ݵ�� ���־�� �Ѵ�. �� �׷��� ������ ���� �߻�
													 // RuntimeExeption�� ��ӹ����� Unchecked Exception�� �Ǹ�, �� ��� ����ó���� ���� �ʾƵ� ������ ���� �߻� X
	
	// ������ �޼���
	public BizException(String msg) {
		super(msg); // �θ� ������ �޼��带 ȣ���ؼ� ���� ���ڿ��� �Ѱ���
		}
	
	// ������ �޼���
	public BizException(Exception ex) {
		super(ex); // �θ� ������ �޼��带 ȣ���ؼ� ���ܰ� �߻��� Ŭ������ �Ѱ���
	}

}
