package kr.programmers;

public class MusicBox {
	
	public void playMusicA () {
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
			System.out.println("���� ���ǤФ�");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
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
