import java.text.SimpleDateFormat;
import java.util.Date;

public class TPC50 {
	public static void main(String[] args) {
		
		// Date Ŭ���� -> ������ Ŭ������ ��ŭ ������ ������ ���� ��� X -> Calendar Ŭ���� ���
		Date date = new Date();
		System.out.println(date.toString()); // toString() ���� ����
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz"); // �е� ���ĺ� m�̹Ƿ� ���� ��Ÿ������ M�� ��� �Ѵ�. a: ����/���� zzz: Ÿ����
		System.out.println(sdf.format(date)); // �̷��� SimpleDateFormat�� �̿��� ���� ���ϴ� ���� �ҷ��� ���� �ִ�.
		
		System.out.println(date.getTime()); // ���� �ð��� long Ÿ������ ��ȯ
		long today = System.currentTimeMillis(); // System Ŭ������ ����� ���� �ð��� long Ÿ������ ��ȯ
		System.out.println(today);
		
		System.out.println(today - date.getTime()); // �̷��� �ð����� ���굵 ����
		
		System.out.println(date.getMonth() + 1); // �ڹٴ� ���� 0 ~ 11�� ���� ǥ�� -> ���� +1 �ؾ� ���� �� ���´�. (�� �׾����� ���� �� ��������� �ִ� ����)
		
	}
}
