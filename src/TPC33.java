//import kr.infrine.MyClass;
import kr.infrine.*;

public class TPC33 {
	public static void main(String[] args) {
		
		kr.infrine.MyClass my = new kr.infrine.MyClass(); // �̷��� Ǯ ��θ� ���൵ ����, �׷��� ������ import ���
		int v = my.sum(10, 100);
		System.out.println(v);
		
		MyClass my2 = new MyClass();
		int v2 = my2.sum(0, 100);
		System.out.println(v2);
		
	}
}
