import kr.tpc.*;

public class TPC32 {
	public static void main(String[] args) {
		
		// A, B 클래스를 저장할 배열을 만드시오.
		Object[] o = new Object[2]; // 다형성 배열
		o[0] = new A();
		o[1] = new B();
		
		for(int i = 0; i < o.length; i++) {
			if(o[i] instanceof A) {
				((A)o[i]).go();
			}
			else {
				((B)o[i]).go();
			}
		}
		
		printGo(o);

	}

	private static void printGo(Object[] o) { // 배열을 메서드로 받아서 출력
		
		for(int i = 0; i < o.length; i++) {
			if(o[i] instanceof A) {
				((A)o[i]).go();
			}
			else {
				((B)o[i]).go();
			}
		}
		
	}
}
