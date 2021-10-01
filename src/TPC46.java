public class TPC46 {
	public static void main(String[] args) {
		
		// Math 클래스 - 수학 계산을 위한 클래스
		// 생성자가 private이라 new 연산자 사용 불가능 but 모든 메서드와 속성이 static이라 객체생성 없이 사용 가능
		
		int value1 = Math.max(5, 30); // 최댓값
		System.out.println(value1);
		int value2 = Math.min(5, 30); // 최솟값
		System.out.println(value2);
		
		System.out.println(Math.abs(-10)); // 절댓값
		
		System.out.println(Math.random()); // 0 이상 1.0 미만의 랜덤한 실수값 리턴해준다.
		
		System.out.println(Math.sqrt(25)); // 제곱근 (제곱해서 25 되는 숫자), 얘도 리턴값이 실수인듯
		
		System.out.println("2의 10승 = " + Math.pow(2, 10));
	    
		System.out.println("16의 1/2승 = : " + Math.pow(16, 0.5));
	    
		System.out.println("log200 = " + Math.log10(200));
		
	}
}
