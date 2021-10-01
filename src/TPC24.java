import kr.tpc.*;

public class TPC24 {
	public static void main(String[] args) {
		
		// 1. ������ �μ�
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);

	}

	// �޼��� overloading(�ߺ�����) �̷��� �ϸ� �޼��尡 ������ ����ϱ� ������ �μ��� �̿��Ͽ� �ؿ�ó�� �θ� Ÿ������ �޴´�.
	/*
	private static void display(Cat c) {
	}

	private static void dispaly(Dog d) {
	}
	*/
	
	private static void display(Animal r) { // ������ �μ�, ���� ������ upcasting �ż� �޾�����. �ֻ��� Ŭ������ Object ��뵵 ����
		r.eat();
		//((Cat)r).night(); // �׳� �̷��� �����ϸ� Dog Ÿ�Կ��� ������ ����.
		if(r instanceof Cat) { // ���� r�� Cat Ÿ������ ��������ٸ� -> Dog Ÿ�Կ����� ������� �ʴ´�. instanceof�� ���� ���� ����ȯ�� �� ������ ���� �� �ִ�.
			((Cat)r).night(); // downcasting
		}
		
	}
}
