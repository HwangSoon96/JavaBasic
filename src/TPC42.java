public class TPC42 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		
	}
	
	public static int divide(int i, int j) throws IllegalArgumentException { // 예외를 메서드 호출한 쪽에 던진다.
		if(j == 0) {
			// return 0; // 함수의 경우 return을 만나면 종료되기 때문에 k에는 0이 들어간다.
			throw new IllegalArgumentException("0으로 나눌 수 없습니다."); // -> 이럴 경우, 어떤 수를 0으로 나누면 0이 된다는 식이 성립하기 때문에 직접 오류를 발생시켜 프로그램을 종료시켜 줄 수 있다.
		}
		int k = i / j;
		return k;
	}
		
}