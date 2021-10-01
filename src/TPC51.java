import java.util.Calendar;

public class TPC51 {
	public static void main(String[] args) {
		
		// Calendar Ŭ���� (�߻� Ŭ����)
		Calendar cal = Calendar.getInstance(); // Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� ��ü ���� �Ұ�
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.YEAR)); // get(���) -> ��� ��� �� class��.~ ���� ���
		System.out.println(cal.get(Calendar.MONTH) + 1); // �ڹٴ� ���� 0 ~ 11�� ���� ǥ�� -> ���� +1 �ؾ� ���� �� ���´�.
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); // �ð��� 0 ~ 11�� ���
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // �ð��� 0 ~ 23�� ���
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5); // �ð��� 5�ð� �ķ� �����. -> ���ϴ� �ð����� ���� ����
		System.out.println();
		
		System.out.println(cal.get(Calendar.YEAR)); // get(���) -> ��� ��� �� class��.~ ���� ���
		System.out.println(cal.get(Calendar.MONTH) + 1); // �ڹٴ� ���� 0 ~ 11�� ���� ǥ�� -> ���� +1 �ؾ� ���� �� ���´�.
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); // �ð��� 0 ~ 11�� ���
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // �ð��� 0 ~ 23�� ���
		System.out.println(cal.get(Calendar.MINUTE));
		
	}
}
