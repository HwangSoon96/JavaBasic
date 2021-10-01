public class TPC35 {
	public static void main(String[] args) {
		
		String str1 = new String("APPLE");
		String str2 = new String("APPLE");
		
		if(str1 == str2) { // heap area의 str1 & str2 객체는 각각 다른 메모리 공간에 생성되어 번지수가 다르므로 NO
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if(str1.equals(str2)) { // str1 & str2 객체는 각각 다른 메모리 공간에 생성되어 번지수가 다르므로 값끼리 비교하려면 equlas 메서드 써야 한다. YES
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if(str3 == str4) { // Literal Pool 이라는 문자열 상수가 생성되는 메모리 영역에서는 값이 같으면 번지를 재활용하므로 번지도 같다. YES
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		if(str3.equals(str4)) { // 문자열이 가지고 있는 값을 비교할 때는 무조건 equals 메서드 써라.
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
}
