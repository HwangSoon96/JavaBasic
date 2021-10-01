import java.lang.String; // java.lang.*은 기본으로 import 되어 있다.

public class TPC34 {
	public static void main(String[] args) {
		
		// java.lang.String str = new java.lang.String("APPLE");
		String str = new String("APPLE");
		
		String v = str.toLowerCase(); // 문자열을 소문자로 변경
		System.out.println(v);
		System.out.println(str.charAt(3)); // 문자열의 3번 인덱스 인자
		System.out.println(str.length());
		System.out.println(str.indexOf("PL")); // 문자열에서 PL이 나오는 처음 인덱스 번호, 2
		System.out.println(str.indexOf("PX")); // PX는 없으므로 -1 출력
		System.out.println(str.replaceAll("P", "X")); // 문자열에서 P를 다 X로 바꿔라
		
	}
}
