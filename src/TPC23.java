import kr.tpc.*;


public class TPC23 {
	public static void main(String[] args) {
		
		// upcasting
		// Object anii = new Cat();  // 최상위 클래스도 활용 가능, 후에 자주 쓰임
		Animal ani = new Cat(); // upcasting
		ani.eat(); // 컴파일 시점 -> Animal, 실행 시점 -> override에 의해 Cat의 eat 메서드 실행
		
		// downcasting
		// ani.night(); // 사용 불가
		// Cat c = (Cat)ani;
		// c.night();
		((Cat)ani).night(); // 연산자의 우선순위가 casting 보다 .(점)연산자가 더 높으므로 (Cat)ani를 괄호로 한번 더 묶어줘야 한다.

		ani = new Dog();
		ani.eat();
		
		// 다형성(message polymorphism) - 객체지향 프로그래밍의 '꽃'
		// 상위 클래스가 하위 클래스에게 동일한 메세지를 보냈을 때(동일한 메서드를 호출했을 때) 서로 다르게 동작시키는 원리
		
		Object o = new Dog();
		// o.eat(); // Object 클래스에는 eat 메서드가 없으므로 override x -> 상속관계는 맞지만 이렇게 사용 불가능
		((Dog)o).eat(); // downcasting 활용하면 eat 메서드 활용 가능
		
	}
}
