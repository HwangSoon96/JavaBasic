import kr.poly.*;

public class TPC26 {
	public static void main(String[] args) {
		
		// Animal a = new Animal(); // 추상 클래스는 단독으로 객체 생성 불가
		
		// eat 메서드가 하위 클래스에 재정의 되어 있어야 다형성이 보장된다.
		Animal ani = new Dog();
		ani.eat(); // eat{개}
		ani.move();
		
		ani = new Cat();
		ani.eat(); // eat{고양이}
		ani.move();
		((Cat)ani).night();

	}
}
