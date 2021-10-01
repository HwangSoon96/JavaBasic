import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TPC52 {
	public static void main(String[] args) {
		
		// java.time 패키지
		LocalDateTime timePoint = LocalDateTime.now(); // 현재 시간에 대한 정보를 가진 객체 생성
		System.out.println(timePoint);
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12); // 2012년 12월 12일에 대한 정보를 가진 객체 생성 -> 내가 원하는 시간에 대한 객체 생성 가능
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18); // 17시 18분에 대한 정보를 가진 객체 생성
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timePoint.toLocalDate(); // LocalDate는 일까지의 정보만 가질 수 있다.
		System.out.println(theDate); // 2021-09-22
		
		System.out.println(timePoint.getMonth());
		Month month = timePoint.getMonth();
		System.out.println(month.getValue());
		System.out.println(timePoint.getMonthValue()); // date나 calendar와 다르게 월 +1 안해줘도 된다.
		
	}
}
