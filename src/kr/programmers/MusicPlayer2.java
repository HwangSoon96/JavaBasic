package kr.programmers;

public class MusicPlayer2 extends Thread {
	
	int type;
	MusicBox2 musicBox2;
	
	public MusicPlayer2(int type, MusicBox2 musicBox2) {
		this.type = type;
		this.musicBox2 = musicBox2;
	}

	@Override
	public void run() {
		
		switch (type) {
		case 1: {
			musicBox2.playMusicA();
			break;
		}
		case 2: {
			musicBox2.playMusicB();
			break;
			}
		case 3: {
			musicBox2.playMusicC();
			break;
			}

		}
		
	}

}
