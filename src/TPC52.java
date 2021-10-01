import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TPC52 {
	public static void main(String[] args) {
		
		// java.time ��Ű��
		LocalDateTime timePoint = LocalDateTime.now(); // ���� �ð��� ���� ������ ���� ��ü ����
		System.out.println(timePoint);
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12); // 2012�� 12�� 12�Ͽ� ���� ������ ���� ��ü ���� -> ���� ���ϴ� �ð��� ���� ��ü ���� ����
		System.out.println(ld1);
		
		LocalTime lt1 = LocalTime.of(17, 18); // 17�� 18�п� ���� ������ ���� ��ü ����
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
		LocalDate theDate = timePoint.toLocalDate(); // LocalDate�� �ϱ����� ������ ���� �� �ִ�.
		System.out.println(theDate); // 2021-09-22
		
		System.out.println(timePoint.getMonth());
		Month month = timePoint.getMonth();
		System.out.println(month.getValue());
		System.out.println(timePoint.getMonthValue()); // date�� calendar�� �ٸ��� �� +1 �����൵ �ȴ�.
		
	}
}
