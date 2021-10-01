package kr.tpc;

public class OverLoad {
	// 동작(메서드)으로만 이루어지 객체
	// 오버로딩, 메서드의 signature(매개변수 타입, 갯수)가 달라 이름이 같아도 다른 메서드로 인식된다.
	// 또한 같은 이름의 메서드도 signature에 따라 컴퓨터에선 다 다르게 저장하므로
	// 이로 인해 속도가 느려질 일은 없다. -> 정적 바인딩 (컴파일 시점에서 이미 호출될 메서드가 결정되어 있는 바인딩)
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}

	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
