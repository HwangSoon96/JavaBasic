import kr.programmers.MusicBox2;
import kr.programmers.MusicPlayer2;

public class TPC63 {
	public static void main(String[] args) {
		
		// 여러 개의 Thread들이 공유객체의 메소드를 사용할 때 메소드에 synchronized가 붙어 있을 경우 먼저 호출한 메소드가 객체의 사용권(Monitoring Lock)을 얻는다.
		MusicBox2 box = new MusicBox2();
		
		MusicPlayer2 choi = new MusicPlayer2(1, box);
		MusicPlayer2 yoon = new MusicPlayer2(2, box);
		MusicPlayer2 park = new MusicPlayer2(3, box);
		
		choi.start();
		yoon.start();
		park.start();
		
	}
}
