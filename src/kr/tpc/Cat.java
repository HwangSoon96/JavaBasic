package kr.tpc;
public class Cat extends Animal{
	
	// ��Ŭ�� �� source���� override Ŭ���ص� ���� ����
	@Override
	public void eat() {
		System.out.println("�����ó�� �Դ´�.");
	}

	public void night() {
		System.out.println("�㿡 ������ ���� ����.");
	}

}
