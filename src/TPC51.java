import java.util.Calendar;

public class TPC51 {
	public static void main(String[] args) {
		
		// Calendar 클래스 (추상 클래스)
		Calendar cal = Calendar.getInstance(); // Calendar 클래스는 추상 클래스이므로 객체 생성 불가
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.YEAR)); // get(상수) -> 상수 사용 시 class명.~ 으로 사용
		System.out.println(cal.get(Calendar.MONTH) + 1); // 자바는 월을 0 ~ 11월 까지 표현 -> 따라서 +1 해야 현재 월 나온다.
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); // 시간을 0 ~ 11로 사용
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 시간을 0 ~ 23로 사용
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); // 시간을 5시간 후로 맞춘다. -> 원하는 시간으로 조작 가능
		System.out.println();
		
		System.out.println(cal.get(Calendar.YEAR)); // get(상수) -> 상수 사용 시 class명.~ 으로 사용
		System.out.println(cal.get(Calendar.MONTH) + 1); // 자바는 월을 0 ~ 11월 까지 표현 -> 따라서 +1 해야 현재 월 나온다.
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); // 시간을 0 ~ 11로 사용
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 시간을 0 ~ 23로 사용
		System.out.println(cal.get(Calendar.MINUTE));
		
	}
}
