import kr.programmers.MusicBox;
import kr.programmers.MusicPlayer;

public class TPC62 {
	public static void main(String[] args) {
		
		// ������� ������ü
		// �ϳ��� ��ü(MusicBox)�� ���� ���� ������(MusicPlayer)�� ���
		MusicBox box = new MusicBox();
		
		MusicPlayer choi = new MusicPlayer(1, box);
		MusicPlayer yoon = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		choi.start();
		yoon.start();
		park.start();
		
	}
}
