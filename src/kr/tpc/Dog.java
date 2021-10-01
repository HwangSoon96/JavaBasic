package kr.tpc;
public class Dog extends Animal{
	// 이름, 나이, 종 : 상태정보
	// 먹는다 : 행위정보(상속은 행위정보 측면)
	
	// 메서드 재정의(override)
	public void eat() {
		System.out.println("개처럼 먹는다.");
	}
	
	public Dog() {
		super(); // 부모클래스의 생성자 메서드를 불러온다. (부모 객체 생성 먼저)
	}

}
