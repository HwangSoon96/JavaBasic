import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {
		
		// ��� ���迡�� �θ� Ŭ������ Ȱ������ �ʴ� ���
		Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();
		c.night();
		
		System.out.println();
		
		// ��� ���迡�� �θ� Ŭ������ Ȱ���Ͽ� �ڽ� Ŭ������ �޼��忡 �����ϴ� ���
		// Dog.class, Cat.class
		Animal ani = new Dog(); // upcasting(�ڵ� ����ȯ)
		ani.eat(); // override�� ���� Dog Ŭ������ eat �޼��� ����
		ani = new Cat();
		ani.eat();
		//Cat cc = (Cat)ani;
		//cc.night(); // �� �� ���� �ٿ��� �Ʒ�ó�� ���
		((Cat)ani).night(); // downcasting(���� ����ȯ), �θ� �ڽ� Ÿ������ ��ȯ
		
		// ��� ���迡�� ���� Ŭ������ ���� Ŭ�������� ������ �޼��带 ȣ���ϸ� ���� �ٸ��� ���۵Ǵ� ���� -> ������
		// ��ó�� �Դ´�/�����ó�� �Դ´�
		
	}
}
