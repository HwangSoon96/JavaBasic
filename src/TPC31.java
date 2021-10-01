import kr.tpc.*;

public class TPC31 {
	public static void main(String[] args) {
		
		A a = new A();
		display(a);
		B b = new B();
		display(b);

	}

	private static void display(Object o) { // A 타입과 B 타입 모두를 받을 수 있는건 부모다. -> 다형성 인수
		if(o instanceof A) {
			((A)o).go();
		}
		else {
			((B)o).go();
		}
	}
}
