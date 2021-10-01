import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat(); // override로 인해 부모 클래스의 물음표가 아닌 자식 클래스의 eat 기능이 실행된다.
		
		Cat c = new Cat();
		c.eat();
		c.night();
		// 여기까지는 부모 클래스 활용 x, Dog 클래스와 Cat 클래스를 직접 설계한 경우 이렇게 사용 가능
		// 만약 Dog 클래스와 Cat 클래스를 다른 사람이 만들어 class 파일만 받았을 경우, 각 클래스에 어떤 기능이 있는줄 모르기 때문에 밑에 처럼 부모를 활용하여 이용해야 한다.
		System.out.println();
		
		Animal dd = new Dog(); // Animal과 Dog는 타입이 다르지만 부모 = 자식(하위 클래스가 상위 클래스를 가리킨다.)의 상속 관계 에서는 자동 형변환 된다.(upcasting)
		dd.eat(); // 상위 클래스의 eat()이 아니라 하위 클래스의 eat()이 실행
				  // 해당 메서드가 자식 메서드에 재정의(override)가 되어 있으면 자식 메서드가 실행된다. 단, 동적 바인딩(호출될 메서드가 실행시점에서 결정되는 바인딩)으로 인해 속도 저하 발생

		dd = new Cat();
		dd.eat();
		// dd.night(); -> 단, night 메서드는 Cat에만 있으므로 이거는 불가능 -> 형변환 필요
		((Cat)dd).night(); // 강제 형변환(downcasting)

	}
}
