package kr.tpc;

public class OverLoad {
	// ����(�޼���)���θ� �̷���� ��ü
	// �����ε�, �޼����� signature(�Ű����� Ÿ��, ����)�� �޶� �̸��� ���Ƶ� �ٸ� �޼���� �νĵȴ�.
	// ���� ���� �̸��� �޼��嵵 signature�� ���� ��ǻ�Ϳ��� �� �ٸ��� �����ϹǷ�
	// �̷� ���� �ӵ��� ������ ���� ����. -> ���� ���ε� (������ �������� �̹� ȣ��� �޼��尡 �����Ǿ� �ִ� ���ε�)
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}

	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
