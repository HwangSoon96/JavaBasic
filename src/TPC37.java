import java.util.ArrayList;

import kr.infrine.ObjectArray;
import kr.tpc.*;

public class TPC37 {
	public static void main(String[] args) {
		
		// ObjectArray arr = new ObjectArray(); // 길이 10짜리 배열 생성
		// ObjectArray<A> arr = new ObjectArray<A>(5); // 배열<타입> 이렇게 선언하면 <>안에 있는 타입만 배열에 넣을 수 있다. (제네릭)
		ObjectArray arr = new ObjectArray(5); 
		arr.add(new A()); // 이 부분에서 Object arr = new A(); upcasting
		arr.add(new B()); // Object 타입으로 받기 때문에 서로 다른 객체를 넣을 수 있다.
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		
		for(int i = 0; i < arr.size(); i++) {
			Object o = arr.get(i); // get 메서드를 쓰면 Object 타입으로 리턴해주기 때문에 밑에 각 클래스의 메서드를 쓰려면 downcasting을 해줘야 한다.
			if(o instanceof A) {
				((A)o).go();
			}
			else {
				((B)o).go();
			}
		}
		
		System.out.println();
		
		// 자바에서 제공해주는 ArrayList를 쓰면 길이에 상관없이 값을 막 넣을 수 있다.
		ArrayList arr2 = new ArrayList(5);
		arr2.add(new A());
		arr2.add(new B());
		arr2.add(new A());
		arr2.add(new A());
		arr2.add(new B());
		arr2.add(new A());
		arr2.add(new A());
		arr2.add(new A());
		arr2.add(new A());
		
		for(int i = 0; i < arr2.size(); i++) {
			Object o = arr2.get(i);
			if(o instanceof A) {
				((A)o).go();
			}
			else {
				((B)o).go();
			}
		}
	}
}
