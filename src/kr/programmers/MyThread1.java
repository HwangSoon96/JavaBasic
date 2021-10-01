package kr.programmers;

public class MyThread1 extends Thread { // �����带 ����ϴ� ù��° ��� -> Thread Ŭ������ ���

	private String str;
	
	//������ �޼���
	public MyThread1(String str) {
		this.str = str;
	}	
	
	// + run �޼��带 overriding (������)
	@Override
	public void run() { // �ٸ� �帧�� ���� �޼��� ���� ����?
		
		// ���⿡ �����ų �۾� �־������ �ȴ�.
		for(int i = 0; i < 10; i++) {
			System.out.print(str);
			try {
				Thread.sleep((int)(Math.random() * 1000)); // Math.random() -> 0�� 1.0 ���� �� �����ϰ� ���´�. �׷� 1000�� 1�ʴϱ� 0.x �� �����ϰ� ����
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
