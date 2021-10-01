import kr.tpc.*;

public class TPC25 {
	public static void main(String[] args) {
		
		// 2. ������ �迭
		// Dog, Cat ������ �迭�� �����Ͻÿ�.
		
		Animal[] ani = new Animal[2]; // �ֻ��� Ŭ������ Object ��� ����
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for(int i = 0; i < ani.length; i++ ) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
			    ((Cat)ani[i]).night();
			}
		}
		
		display(ani); // ������ �迭�� �޴� ������ �޼��带 ���� ��µ� �����ϴ�.

	}

	private static void display(Animal[] ani) {
		for(int i = 0; i < ani.length; i++ ) {
			ani[i].eat();
			if(ani[i] instanceof Cat) {
			    ((Cat)ani[i]).night();
			}
		}
	}
	
}
