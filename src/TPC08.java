public class TPC08 {
	public static void main(String[] args) { // static이 있어야 메모리에 로드 되기 때문에 메인은 무조건 static을 가지고 있어야 한다.
		int a = 30;
		int b = 50;
		int v = add(a, b); // static method를 call(호출)
		System.out.println(v);

	}
	
	public static int add(int a, int b) { // static -> 프로그램이 실행되기 전에 메모리의 고정된 위치에 메서드(기계어 코드)를 자동으로 로딩 시켜주는 역할
		int sum = a + b;
		return sum;
	}
	
}
