package kr.poly;
public class Dog extends Animal{
	// 이름, 나이, 종 : 상태정보
	// 먹는다 : 행위정보(상속은 행위정보 측면)
	
	// 메서드 재정의(override)
	// 상위 클래스의 추상 메서드를 재정의 하지 않으면 하위 클래스도 추상 클래스가 된다. -> 재정의 없으면 에러 발생
	public void eat() {
		System.out.println("개처럼 먹는다.");
	}
	
	public Dog() {
		super(); // 부모클래스의 생성자 메서드를 불러온다. (부모 객체 생성 먼저)
	}

}
