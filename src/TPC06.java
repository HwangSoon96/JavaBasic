public class TPC06 {
	public static void main(String[] args) { // 메인도 프로그램의 시작을 담당하는 하나의 매서드
		// 메서드 -> 동작(method), 기능(function)
		int a = 67;
		int b = 98;
		// a + b = ?
		int result = sum(a, b); // 메서드 호출
		System.out.println(result);
		
		int[] arr= makeArr(); // 10, 20, 30
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);

	}
	// 점수 2개를 매개변수로 받아 더해서 총합을 구하고 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) { // 매개변수 전달기법
		int v = a + b;
		return v; // 리턴값을 메서드 이름에 담아 하나의 형태로 다시 전달해준다 -> 메서드도 일종의 변수처럼 생각할 수 있다.
	}
	// 10 20 30
	public static int[] makeArr() { // 배열 형태로 리턴 하므로 int[] 써줘야 한다.
		int x = 10;
		int y = 20;
		int z = 30;
		int[] arr = new int[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		
		return arr; // 하나의 형태만 리턴 가능하므로 배열 형태로 만들어서 리턴해준다.
	}
}
