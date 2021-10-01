//import kr.infrine.MyClass;
import kr.infrine.*;

public class TPC33 {
	public static void main(String[] args) {
		
		kr.infrine.MyClass my = new kr.infrine.MyClass(); // 이렇게 풀 경로를 써줘도 가능, 그러나 보통은 import 사용
		int v = my.sum(10, 100);
		System.out.println(v);
		
		MyClass my2 = new MyClass();
		int v2 = my2.sum(0, 100);
		System.out.println(v2);
		
	}
}
