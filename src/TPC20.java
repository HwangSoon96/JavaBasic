import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Dog, Cat --> Animal (항상 상위 클래스부터 메모리에 올라간다.)
		
		Dog d = new Dog();
		d.eat(); // Dog 클래스에는 eat 메서드가 존재하지 않아도 Animal 클래스(부모)에게 상속받아 eat 메서드 사용 가능 (즉, 하위 클래스가 상위 클래스의 기능을 사용 가능하도록 확장된다.)
		
		Cat c = new Cat();
		c.eat();
		
		// Animal <-- [Dog.class, Cat.class]
		
		Animal ani = new Dog(); // 부모 ani = new 자식 -> upcasting (자동 형변환)
		ani.eat(); // 해당 메서드가 자식 메서드에 재정의(override)가 되어 있으면 자식 메서드가 실행된다. 단, 동적 바인딩(호출될 메서드가 실행시점에서 결정되는 바인딩)으로 인해 속도 저하 발생
				   // Dog 클래스의 기능을 몰라도 override 이용하면 부모 클래스를 이용하여 Dog 클래스의 기능을 실행시킬 수 있다. (?)
		
		ani = new Cat();
		ani.eat();

	}
}
