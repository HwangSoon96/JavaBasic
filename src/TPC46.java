public class TPC46 {
	public static void main(String[] args) {
		
		// Math Ŭ���� - ���� ����� ���� Ŭ����
		// �����ڰ� private�̶� new ������ ��� �Ұ��� but ��� �޼���� �Ӽ��� static�̶� ��ü���� ���� ��� ����
		
		int value1 = Math.max(5, 30); // �ִ�
		System.out.println(value1);
		int value2 = Math.min(5, 30); // �ּڰ�
		System.out.println(value2);
		
		System.out.println(Math.abs(-10)); // ����
		
		System.out.println(Math.random()); // 0 �̻� 1.0 �̸��� ������ �Ǽ��� �������ش�.
		
		System.out.println(Math.sqrt(25)); // ������ (�����ؼ� 25 �Ǵ� ����), �굵 ���ϰ��� �Ǽ��ε�
		
		System.out.println("2�� 10�� = " + Math.pow(2, 10));
	    
		System.out.println("16�� 1/2�� = : " + Math.pow(16, 0.5));
	    
		System.out.println("log200 = " + Math.log10(200));
		
	}
}
