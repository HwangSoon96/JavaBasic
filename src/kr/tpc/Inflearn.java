package kr.tpc;

public class Inflearn {
	
	private Inflearn() { // private �����ڸ� ����ϸ� ��ü ������ ���� �� �ִ�.
						//	= private �����ڸ� ���� Ŭ������ ��� �޼���� static�̾�� �Ѵ�.
						// static�� non-static�� ���ÿ� ����Ϸ��� ������ �޼��带 public���� �ϰ� static �޼���� Ŭ������.�޼����,
						// non-static �޼���� ��ü �����ؼ� ����ϸ� �ȴ�.
		
	}
	
	// �ν��Ͻ� �޼���
	public void tpc() {
		System.out.println("TPC ���� �ʹ� ����ִ�.");
	}
	// Ŭ���� �޼���
	public static void java() {
		System.out.println("�ڹ� ���� �ʹ� ����ִ�.");
	}

}
