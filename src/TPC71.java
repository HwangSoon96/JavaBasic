import kr.programmers.*;

public class TPC71 {
	public static void main(String[] args) {
		
		
		// Action action = new MyAction(); // Action�� �߻� Ŭ�����̱� ������ ��ü ���� X
		// action.exec();
		// ��������� �Ϲ����� ���
		
		// �͸� Ŭ����
		// �͸�Ŭ������ ����� ������ Action�� ��ӹ޴� Ŭ������ ���� �ʿ䰡 ���� ����̴�.
		// Action�� ��ӹ޴� Ŭ������ �ش� Ŭ���������� ���ǰ� �ٸ� Ŭ���������� ������ �ʴ� ����̴�.
		Action action = new Action() { // ������ ������ �߰�ȣ ���� �ݰ� ������, �ش� ������ �̸��� �ش��ϴ� Ŭ������ ��ӹ޴� �̸����� ��ü�� ����ٴ� ���� ���Ѵ�.
									   // ��ȣ �ȿ��� �޼ҵ带 �����ϰų� �޼ҵ带 �߰� ����. �̷��� ������ �̸� ���� ��ü�� action�̶�� ���������� �����ϵ��� �ϰ�, exec()�޼ҵ带 ȣ��.
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
	}
}
