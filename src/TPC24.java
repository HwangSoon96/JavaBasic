import kr.tpc.*;

public class TPC24 {
	public static void main(String[] args) {
		
		// 1. 다형성 인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);

	}

	// 메서드 overloading(중복정의) 이렇게 하면 메서드가 여러개 생기니까 다형성 인수를 이용하여 밑에처럼 부모 타입으로 받는다.
	/*
	private static void display(Cat c) {
	}

	private static void dispaly(Dog d) {
	}
	*/
	
	private static void display(Animal r) { // 다형성 인수, 인자 받을때 upcasting 돼서 받아진다. 최상위 클래스인 Object 사용도 가능
		r.eat();
		//((Cat)r).night(); // 그냥 이렇게 실행하면 Dog 타입에서 에러가 난다.
		if(r instanceof Cat) { // 만약 r이 Cat 타입으로 만들어졌다면 -> Dog 타입에서는 실행되지 않는다. instanceof를 통해 언제 형변환을 할 것인지 정할 수 있다.
			((Cat)r).night(); // downcasting
		}
		
	}
}
