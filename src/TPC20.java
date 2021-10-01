import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Dog, Cat --> Animal (�׻� ���� Ŭ�������� �޸𸮿� �ö󰣴�.)
		
		Dog d = new Dog();
		d.eat(); // Dog Ŭ�������� eat �޼��尡 �������� �ʾƵ� Animal Ŭ����(�θ�)���� ��ӹ޾� eat �޼��� ��� ���� (��, ���� Ŭ������ ���� Ŭ������ ����� ��� �����ϵ��� Ȯ��ȴ�.)
		
		Cat c = new Cat();
		c.eat();
		
		// Animal <-- [Dog.class, Cat.class]
		
		Animal ani = new Dog(); // �θ� ani = new �ڽ� -> upcasting (�ڵ� ����ȯ)
		ani.eat(); // �ش� �޼��尡 �ڽ� �޼��忡 ������(override)�� �Ǿ� ������ �ڽ� �޼��尡 ����ȴ�. ��, ���� ���ε�(ȣ��� �޼��尡 ����������� �����Ǵ� ���ε�)���� ���� �ӵ� ���� �߻�
				   // Dog Ŭ������ ����� ���� override �̿��ϸ� �θ� Ŭ������ �̿��Ͽ� Dog Ŭ������ ����� �����ų �� �ִ�. (?)
		
		ani = new Cat();
		ani.eat();

	}
}
