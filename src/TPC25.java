import kr.tpc.*;

public class TPC25 {
	public static void main(String[] args) {
		
		// 2. 다형성 배열
		// Dog, Cat 저장할 배열을 생성하시오.
		
		Animal[] ani = new Animal[2]; // 최상위 클래스인 Object 사용 가능
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i = 0; i < ani.length; i++ ) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
			    ((Cat)ani[i]).night();
			}
		}
		
		display(ani); // 다형성 배열을 받는 별도의 메서드를 만들어서 출력도 가능하다.

	}

	private static void display(Animal[] ani) {
		for(int i = 0; i < ani.length; i++ ) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
			    ((Cat)ani[i]).night();
			}
		}
	}
	
}
