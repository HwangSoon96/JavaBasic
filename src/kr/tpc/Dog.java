package kr.tpc;
public class Dog extends Animal{
	// �̸�, ����, �� : ��������
	// �Դ´� : ��������(����� �������� ����)
	
	// �޼��� ������(override)
	public void eat() {
		System.out.println("��ó�� �Դ´�.");
	}
	
	public Dog() {
		super(); // �θ�Ŭ������ ������ �޼��带 �ҷ��´�. (�θ� ��ü ���� ����)
	}

}
