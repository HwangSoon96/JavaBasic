public class TPC06 {
	public static void main(String[] args) { // 메인도 프로그램의 시작을 담당하는 하나의 매서드
		// 메서드와 변수의 관계
		// 메서드 -> 동작(method), 기능(function)
		int a = 67;
		int b = 98;
		// a + b = ?
		int result = sum(a, b); // 메서드 호출, 메인이 static이므로 메서드 호출을 하려면 호출하려는 메서드도 static이어야 바로 호출 가능.
		System.out.println(result);
		
		int[] arr= makeArr(); // 10, 20, 30이 담긴 배열
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println(hap);

	}
	// 점수 2개를 매개변수로 받아 더해서 총합을 구하고 리턴하는 메서드를 정의하시오.
	public static int sum(int a, int b) { // 매개변수 전달기법(Call by Value, 값을 전달), 메서드가 static으로 메모리에 올라가 있어야 메인에서 바로 메서드 호출이 가능하다.
		int v = a + b;
		return v; // 리턴값을 메서드 이름에 담아 하나의 형태로 다시 전달해준다 -> 메서드도 일종의 변수처럼 생각할 수 있다.
	}
	// 10 20 30을 한번에 리턴하고 싶은 경우
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
