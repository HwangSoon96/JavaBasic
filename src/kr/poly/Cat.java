package kr.poly;
public class Cat extends Animal{
	
	// 우클릭 후 source에서 override 클릭해도 생성 가능
	// 상위 클래스의 추상 메서드를 재정의 하지 않으면 하위 클래스도 추상 클래스가 된다. -> 재정의 없으면 에러 발생
	@Override
	public void eat() {
		System.out.println("고양이처럼 먹는다.");
	}

	public void night() {
		System.out.println("밤에 눈에서 빛이 난다.");
	}

}
