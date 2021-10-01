package kr.programmers;

public class MusicBox2 {
	
	// �̷��� synchronized �޼��忡 �߰��ϸ� ���� ������ �����尡 ���� ���� ����, �� ���� �����尡 ����, ... �̷� ������ ����.
	public synchronized void playMusicA () {
		for(int i =0; i < 10; i++) {
			System.out.println("�ų��� ����!!!");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void playMusicB () {
		for(int i =0; i < 10; i++) {
			synchronized (this) { // synchronized�� �޼ҵ忡 ������ ��� �� ���, �޼ҵ��� �ڵ尡 �������, �������� ����ϴ� �����尡 �ʹ� ���� ��ٸ��� ���� ���� ���ؼ�
								  // �̷��� synchronized ��� �̿��ؼ� Ư�� �κи� ����ȭ ��ų �� �ִ�.
				System.out.println("���� ���ǤФ�");
			}
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// synchronized�� ������ ���� �޼ҵ�� �ٸ� ��������� synchronized �޼ҵ带 �����ϸ鼭 ����͸� ���� ȹ���ߴ� �ϴ���, �װͰ� ������� ����ȴ�.
	public void playMusicC () {
		for(int i =0; i < 10; i++) {
			System.out.println("ī�� ����~");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}