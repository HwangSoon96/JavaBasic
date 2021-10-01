public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		// a + b =?
		//int v = sum(a, b); // sum 메서드는 static이 아니라 그냥 호출 불가능
		TPC09 tpc = new TPC09(); // tpc 라는 변수가 heap area에 있는 TPC09 객체(static area에 있는 add 메서드 주소 정보 포함)를 가리킴
		int v = tpc.sum(a, b);
		System.out.println(v);

	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
	
}