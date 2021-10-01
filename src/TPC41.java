public class TPC41 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (Exception e) {
			e.printStackTrace(); // 얘는 예외 발생한 클래스 정보 + 어디서 발생했는지도 알려주는듯
			System.out.println(e.toString()); // 얘는 예외 발생한 클래스 정보만
		}
		
	}
	
	public static int divide(int i, int j) throws ArithmeticException { // throws Exception 하게 되면 해당 메서드를 호출한 쪽에서 예외를 처리하게끔 호출한 쪽으로 오류를 떠넘기는 것.
																		// 예외 클래스명, 예외 클래스명, ... 으로 예외 여러 개도 가능
		int k = i / j;
		return k;
	}
	
}
