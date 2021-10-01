import kr.tpc.*;


public class TPC23 {
	public static void main(String[] args) {
		
		// upcasting
		// Object anii = new Cat();  // �ֻ��� Ŭ������ Ȱ�� ����, �Ŀ� ���� ����
		Animal ani = new Cat(); // upcasting
		ani.eat(); // ������ ���� -> Animal, ���� ���� -> override�� ���� Cat�� eat �޼��� ����
		
		// downcasting
		// ani.night(); // ��� �Ұ�
		// Cat c = (Cat)ani;
		// c.night();
		((Cat)ani).night(); // �������� �켱������ casting ���� .(��)�����ڰ� �� �����Ƿ� (Cat)ani�� ��ȣ�� �ѹ� �� ������� �Ѵ�.

		ani = new Dog();
		ani.eat();
		
		// ������(message polymorphism) - ��ü���� ���α׷����� '��'
		// ���� Ŭ������ ���� Ŭ�������� ������ �޼����� ������ ��(������ �޼��带 ȣ������ ��) ���� �ٸ��� ���۽�Ű�� ����
		
		Object o = new Dog();
		// o.eat(); // Object Ŭ�������� eat �޼��尡 �����Ƿ� override x -> ��Ӱ���� ������ �̷��� ��� �Ұ���
		((Dog)o).eat(); // downcasting Ȱ���ϸ� eat �޼��� Ȱ�� ����
		
	}
}
