public class TPC39 {
	public static void main(String[] args) {
		
		int a = 1; // 기본형 타입, 객체 X
		Integer b = new Integer(1); // 이게 정석이지만 자바 버전 9부터는 더 편리한 방향을 쓰도록 바뀐듯
		// Integer b2 = 1; // 이렇게 쓰면 줄 안 그어진다. 컴파일러가 1을 Integer로 알아서 변환해준다. (boxing)
		a = b; // 원래는 b.intValue() 메서드로 기본형으로 만들어서 대입해야 하지만 이것도 컴파일러가 알아서 b를 int 형으로 변환해준다. (unboxing)
		System.out.println(b.intValue()); // 1
		System.out.println(b.toString()); // "1"
		
		System.out.println();
		
		Object[] obj = new Object[3];
		// obj[0] = 1; // boxing
		// obj[1] = 2; // 평소에는 이렇게 쓰면 된다.
		// obj[2] = 3;
		obj[0] = new Integer(1); // Object 객체와 int 기본자료형은 서로 형이 달라 상속 관계가 성립하지 않는다. 그러나 Object와 Integer는 객체와 객체 사이므로 상속 관계 성립 (정석)
		obj[1] = new Integer(2);
		obj[2] = new Integer(3);
		
		System.out.println(obj[0].toString()); // 재정의에 의해 자식의 toString()이 실행된다. 
		System.out.println(obj[1].toString());
		System.out.println(obj[2]); // toStirng() 생략 가능]
		
		System.out.println();
		
		// "100" + "100" = 200
		String x = "100";
		String y = "100";
		// System.out.println(x + y); // 100100
		int v1 = Integer.parseInt(x); // 문자열 숫자를 int 형으로 변환
		int v2 = Integer.parseInt(y);
		System.out.println(v1 + v2);
		
		System.out.println();
		
		// 100 + 100 = "100100"
		String s1 = String.valueOf(v1); // int 형을 문자열로 변환
		String s2 = String.valueOf(v2);
		System.out.println(s1 + s2);
		
		// "100" + 100 = "100100" int형과 문자열을 더하면 int형이 자동으로 문자열로 형변환 된다.
		System.out.println(x + v1);
		
	}
}
