package kr.poly;
public abstract class Animal { // 추상 클래스 (불완전한 클래스) -> Animal ani = new Animal(); (X) 객체 생성 불가
	// Dog, Cat 클래스의 공통 기능인 eat()
	public abstract void eat(); // 추상 메서드 (불완전한 메서드), 구현부를 제외한 프로토타입(원형)만 남는다.
	/*
	{
		System.out.println("?"); // 메서드 구현부
	}
	*/
	
	// 추상 클래스는 추상 메서드와 함께 구현 메서드를 같이 넣을 수도 있다.
	// Dog와 Cat 클래스 같이 기능이 비슷한 클래스들은 추상 클래스로 묶으면 이렇게 공통된 구현 메서드도 넣어 사용할 수 있다.
	// 기능이 다른 클래스들을 사용하려면 뒤에 나오는 인터페이스 사용해야 한다.
	public void move() {
		System.out.println("무리를 지어서 이동한다.");
	}
	
	public Animal() {
		super(); // 모든 클래스는 상속을 받지 않으면 최상위 클래스(Object class) 생성자 메서드 호출
	}

}
