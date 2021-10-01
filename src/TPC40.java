public class TPC40 {
	public static void main(String[] args) {
		
		// 예외 처리 -> 프로그램 실행 중 예기치 못한 상황(예외)을 미리 예측하고, 처리 하는 것
		int i = 10;
		int j = 5;
		int k = i / j;
		System.out.println(k); // 2
		
		i = 10;
		j = 0;
		// k = i / j; // java.lang.ArithmeticException 발생 -> 예외가 발생하면 프로그램이 끝까지 실행되지 않고 바로 종료된다.
		// System.out.println(k); // 예외 발생으로 실행 X
		// System.out.println("Main End!!"); // 예외 발생으로 실행 X
		
		i = 10;
		j = 0;
		try {
			k = i / j; // 예외가 발생할 것 같은 코드블록을 try 구문 안에 넣는다.
		} catch (ArithmeticException e) { // catch(예외가 발생한 클래스명? + 변수(e)) 하면 해당 예외 발생 시 catch 구문 안에 있는 코드블록을 실행한다.
			// catch(Exception e) -> Exception 클래스는 모든 예외 클래스들이 상속 받으므로 이렇게 두면 모든 예외 처리 가능
			// try 구문에서 여러 개의 예외가 발생한다면 catch 구문 여러개 사용해서 각각의 예외 처리 가능
			System.out.println("0으로 나눌 수 없습니다. " + e.toString());
		} finally {
			System.out.println("finally는 오류가 발생했든 발생하지 않았든 무조건 실행");
		}
		System.out.println("Main End!!");
	}
}