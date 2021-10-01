import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {
		
		// 상속 관계에서 부모 클래스를 활용하지 않는 방법
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		c.night();
		
		System.out.println();
		
		// 상속 관계에서 부모 클래스를 활용하여 자식 클래스의 메서드에 접근하는 방법
		// Dog.class, Cat.class
		Animal ani = new Dog(); // upcasting(자동 형변환)
		ani.eat(); // override에 의해 Dog 클래스의 eat 메서드 실행
		ani = new Cat();
		ani.eat();
		//Cat cc = (Cat)ani;
		//cc.night(); // 이 두 줄을 줄여서 아래처럼 사용
		((Cat)ani).night(); // downcasting(강제 형변환), 부모가 자식 타입으로 변환
		
		// 상속 관계에서 상위 클래스가 하위 클래스에게 동일한 메서드를 호출하면 서로 다르게 동작되는 원리 -> 다형성
		// 개처럼 먹는다/고양이처럼 먹는다
		
	}
}
