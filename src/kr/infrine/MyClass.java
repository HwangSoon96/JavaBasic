package kr.infrine;

public class MyClass { // ��Ű�� ���� Ŭ�������� public �Ǵ� private �����ϸ� ����Ʈ ���ٱ����� ���� -> ���� ��Ű�� ���� Ŭ�����鸸 ���� ����
	
	public int sum(int a, int b) {
		int hap = 0;
		for(int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}

}
