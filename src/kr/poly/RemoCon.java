package kr.poly;
public interface RemoCon { // �߻� Ŭ������ ���������� �ܵ����� ��ü ���� �Ұ���
	
	// ��� ��� ����, public static final�� ���� ����
	public static final int MAXCH = 100; // static -> ��ü ���� ���� RemoCon.MAXCH�� ��� ����
	public final static int MINCH = 1; // final -> ����� ���� �Ұ�
	
	// �߻� �޼���
	// �������̽��� ������ �޼��带 ���� �� ����. -> 100% �߻� �޼��常 ���� �� �ִ�.
	public abstract void chUp(); // �������̽��� �߻� �޼��常 ���� �� �����Ƿ� abstract�� �⺻������ �����Ǿ� �ִ�.
	public void chDown();
	public void internet();

}
