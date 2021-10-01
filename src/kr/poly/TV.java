package kr.poly;
public class TV implements RemoCon { // 클래스 이름에 마우스 올리면 메서드 구현할 수 있게 밑에 자동으로 생성해준다.
    int currCH = 70;
	@Override
	public void chUp() {
		if(currCH < RemoCon.MAXCH) {
			currCH++;
			System.out.println("TV의 채널이 올라간다. : " + currCH);
		} 
		else {
			currCH = 1;
			System.out.println("TV의 채널이 올라간다. : " + currCH);
		}
		
	}

	@Override
	public void chDown() {
		if(currCH > RemoCon.MINCH) {
			currCH--;
		System.out.println("TV의 채널이 내려간다. : " + currCH);
		}
		else {
			currCH = 100;
			System.out.println("TV의 채널이 내려간다. : " + currCH);
		}
	}

	@Override
	public void internet() {
		System.out.println("인터넷이 된다.");
	}
	
	// TV의 독자적인 기능은 여기에 따로 추가 가능

}
