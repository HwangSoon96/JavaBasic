import kr.poly.*;

public class TPC26 {
	public static void main(String[] args) {
		
		// Animal a = new Animal(); // �߻� Ŭ������ �ܵ����� ��ü ���� �Ұ�
		
		// eat �޼��尡 ���� Ŭ������ ������ �Ǿ� �־�� �������� ����ȴ�.
		Animal ani = new Dog();
		ani.eat(); // eat{��}
		ani.move();
		
		ani = new Cat();
		ani.eat(); // eat{�����}
		ani.move();
		((Cat)ani).night();

	}
}
