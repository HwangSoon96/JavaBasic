import kr.programmers.MusicBox2;
import kr.programmers.MusicPlayer2;

public class TPC63 {
	public static void main(String[] args) {
		
		// ���� ���� Thread���� ������ü�� �޼ҵ带 ����� �� �޼ҵ忡 synchronized�� �پ� ���� ��� ���� ȣ���� �޼ҵ尡 ��ü�� ����(Monitoring Lock)�� ��´�.
		MusicBox2 box = new MusicBox2();
		
		MusicPlayer2 choi = new MusicPlayer2(1, box);
		MusicPlayer2 yoon = new MusicPlayer2(2, box);
		MusicPlayer2 park = new MusicPlayer2(3, box);
		
		choi.start();
		yoon.start();
		park.start();
		
	}
}
