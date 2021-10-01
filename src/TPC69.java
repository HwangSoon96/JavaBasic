public class TPC69 {
	
	// 옛날에는 열거형 대신 상수를 사용
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		
		// enum(열거형)
		String gender1;
		gender1 = TPC69.MALE;
		gender1 = TPC69.FEMALE;
		gender1 = "boy"; // gender에는 MAEL 또는 FEMALE 값만 갖게 하고 싶은데, 상수 사용 시에는 다른 값도 들어갈 수 있다.
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		// gender2 = "boy"; // 대입 불가
		// 특정 값만 가져야 한다면 열거형을 사용하는 것이 좋다.
		
	}
}

// 클래스 바깥에 열거형 선언
enum Gender {
	MALE, FEMALE;
}