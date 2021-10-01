public class TPC70 {
	
	// 1. Ŭ���� �ȿ� �ν��Ͻ� ����, �� �ʵ带 �����ϴ� ��ġ�� ����Ǵ� ���. ���� ��øŬ���� Ȥ�� �ν��Ͻ� Ŭ������� �Ѵ�.
	class Cal {
		int value = 0;
		
		public void plus() {
			value++;
		}
	}
	
	// 2. ���� Ŭ������ static���� ���ǵ� ���, ���� ��ø Ŭ���� �Ǵ� static Ŭ������� �Ѵ�
	static class Cal2 {
		int value = 0;
		
		public void plus() {
			value++;
		}
	}
	
	// 3. �޼ҵ� �ȿ� Ŭ������ ������ ���, ���� ��ø Ŭ���� �Ǵ� ���� Ŭ������� �Ѵ�.
	public void exec() {
		class Cal3 {
			int value = 0;
			
			public void plus() {
				value++;
			}
		}
		Cal3 cal3 = new Cal3();
		cal3.plus();
		cal3.plus();
		cal3.plus();
		System.out.println(cal3.value);
	}
	
	public static void main(String[] args) {
		
		// ���� Ŭ���� -> Ŭ���� �ȿ� ����� Ŭ����
		// ��� ��ġ�� �����ϴ��Ŀ� ���� 4���� ���� ����
		// ���⼭�� 3��, ������ �ϳ��� ����
		
		// 1. ���ο� �ִ� Cal��ü�� �����ϱ� ���ؼ���, �ۿ��� TPC70�� ��ü�� ���� �Ŀ� TPC70.Cal cal = t.new Cal();�� ���� ������� Cal ��ü�� ������ �� ����Ѵ�.
		TPC70 tpc = new TPC70();
		TPC70.Cal cal = tpc.new Cal();
		cal.plus();
		System.out.println(cal.value);
		
		// 2. �ʵ� ������ �� ����ƽ�� �ʵ�� ������ �Ͱ� ����. �� ��쿡�� TPC70 ��ü�� ������ �ʿ���� new TPC70.Cal()�� ��ü�� ������ �� �ִ�.
		TPC70.Cal2 cal2 = new TPC70.Cal2();
		cal2.plus();
		cal2.plus();
		System.out.println(cal2.value);
		
		// 3. �޼ҵ� �ȿ��� �ش� Ŭ������ �̿��� �� �ִ�.
		TPC70 tpc3 = new TPC70();
		tpc3.exec();
		
	}
}
