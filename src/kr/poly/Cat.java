package kr.poly;
public class Cat extends Animal{
	
	// ��Ŭ�� �� source���� override Ŭ���ص� ���� ����
	// ���� Ŭ������ �߻� �޼��带 ������ ���� ������ ���� Ŭ������ �߻� Ŭ������ �ȴ�. -> ������ ������ ���� �߻�
	@Override
	public void eat() {
		System.out.println("�����ó�� �Դ´�.");
	}

	public void night() {
		System.out.println("�㿡 ������ ���� ����.");
	}

}
