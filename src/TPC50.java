import java.text.SimpleDateFormat;
import java.util.Date;

public class TPC50 {
	public static void main(String[] args) {
		
		// Date 클래스 -> 오래된 클래스인 만큼 지역별 시차에 대한 고려 X -> Calendar 클래스 사용
		Date date = new Date();
		System.out.println(date.toString()); // toString() 생략 가능
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz"); // 분도 알파벳 m이므로 월을 나타내려면 M을 써야 한다. a: 오전/오후 zzz: 타임존
		System.out.println(sdf.format(date)); // 이렇게 SimpleDateFormat을 이용해 내가 원하는 값만 불러올 수도 있다.
		
		System.out.println(date.getTime()); // 현재 시간을 long 타입으로 반환
		long today = System.currentTimeMillis(); // System 클래스를 사용한 현재 시간을 long 타입으로 반환
		System.out.println(today);
		
		System.out.println(today - date.getTime()); // 이렇게 시간끼리 연산도 가능
		
		System.out.println(date.getMonth() + 1); // 자바는 월을 0 ~ 11월 까지 표현 -> 따라서 +1 해야 현재 월 나온다. (줄 그어진거 보면 곧 사라질수도 있는 문법)
		
	}
}
