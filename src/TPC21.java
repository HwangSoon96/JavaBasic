import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat(); // override�� ���� �θ� Ŭ������ ����ǥ�� �ƴ� �ڽ� Ŭ������ eat ����� ����ȴ�.
		
		Cat c = new Cat();
		c.eat();
		c.night();
		// ��������� �θ� Ŭ���� Ȱ�� x, Dog Ŭ������ Cat Ŭ������ ���� ������ ��� �̷��� ��� ����
		// ���� Dog Ŭ������ Cat Ŭ������ �ٸ� ����� ����� class ���ϸ� �޾��� ���, �� Ŭ������ � ����� �ִ��� �𸣱� ������ �ؿ� ó�� �θ� Ȱ���Ͽ� �̿��ؾ� �Ѵ�.
		System.out.println();
		
		Animal dd = new Dog(); // Animal�� Dog�� Ÿ���� �ٸ����� �θ� = �ڽ�(���� Ŭ������ ���� Ŭ������ ����Ų��.)�� ��� ���� ������ �ڵ� ����ȯ �ȴ�.(upcasting)
		dd.eat(); // ���� Ŭ������ eat()�� �ƴ϶� ���� Ŭ������ eat()�� ����
				  // �ش� �޼��尡 �ڽ� �޼��忡 ������(override)�� �Ǿ� ������ �ڽ� �޼��尡 ����ȴ�. ��, ���� ���ε�(ȣ��� �޼��尡 ����������� �����Ǵ� ���ε�)���� ���� �ӵ� ���� �߻�

		dd = new Cat();
		dd.eat();
		// dd.night(); -> ��, night �޼���� Cat���� �����Ƿ� �̰Ŵ� �Ұ��� -> ����ȯ �ʿ�
		((Cat)dd).night(); // ���� ����ȯ(downcasting)

	}
}
