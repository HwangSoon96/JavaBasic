public class TPC69 {
	
	// �������� ������ ��� ����� ���
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";
	
	public static void main(String[] args) {
		
		// enum(������)
		String gender1;
		gender1 = TPC69.MALE;
		gender1 = TPC69.FEMALE;
		gender1 = "boy"; // gender���� MAEL �Ǵ� FEMALE ���� ���� �ϰ� ������, ��� ��� �ÿ��� �ٸ� ���� �� �� �ִ�.
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		// gender2 = "boy"; // ���� �Ұ�
		// Ư�� ���� ������ �Ѵٸ� �������� ����ϴ� ���� ����.
		
	}
}

// Ŭ���� �ٱ��� ������ ����
enum Gender {
	MALE, FEMALE;
}