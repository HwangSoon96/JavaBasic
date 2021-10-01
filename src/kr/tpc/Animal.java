package kr.tpc;
public class Animal {
	// Dog, Cat 클래스의 공통 기능인 eat()
	public void eat() {
		System.out.println("?");
	}
	
	public Animal() {
		super(); // 모든 클래스는 상속을 받지 않으면 최상위 클래스(Object class) 생성자 메서드 호출
	}

}
