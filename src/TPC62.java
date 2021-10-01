import kr.programmers.MusicBox;
import kr.programmers.MusicPlayer;

public class TPC62 {
	public static void main(String[] args) {
		
		// 쓰레드와 공유객체
		// 하나의 객체(MusicBox)를 여러 개의 쓰레드(MusicPlayer)가 사용
		MusicBox box = new MusicBox();
		
		MusicPlayer choi = new MusicPlayer(1, box);
		MusicPlayer yoon = new MusicPlayer(2, box);
		MusicPlayer park = new MusicPlayer(3, box);
		
		choi.start();
		yoon.start();
		park.start();
		
	}
}
