import java.util.ArrayList;

import kr.infrine.ObjectArray;
import kr.tpc.*;

public class TPC37 {
	public static void main(String[] args) {
		
		// ObjectArray arr = new ObjectArray(); // ���� 10¥�� �迭 ����
		// ObjectArray<A> arr = new ObjectArray<A>(5); // �迭<Ÿ��> �̷��� �����ϸ� <>�ȿ� �ִ� Ÿ�Ը� �迭�� ���� �� �ִ�. (���׸�)
		ObjectArray arr = new ObjectArray(5); 
		arr.add(new A()); // �� �κп��� Object arr = new A(); upcasting
		arr.add(new B()); // Object Ÿ������ �ޱ� ������ ���� �ٸ� ��ü�� ���� �� �ִ�.
		arr.add(new A());
		arr.add(new A());
		arr.add(new B());
		
		for(int i = 0; i < arr.size(); i++) {
			Object o = arr.get(i); // get �޼��带 ���� Object Ÿ������ �������ֱ� ������ �ؿ� �� Ŭ������ �޼��带 ������ downcasting�� ����� �Ѵ�.
			if(o instanceof A) {
				((A)o).go();
			}
			else {
				((B)o).go();
			}
		}
		
		System.out.println();
		
		// �ڹٿ��� �������ִ� ArrayList�� ���� ���̿� ������� ���� �� ���� �� �ִ�.
		ArrayList arr2 = new ArrayList(5);
		arr2.add(new A());
		arr2.add(new B());
		arr2.add(new A());
		arr2.add(new A());
		arr2.add(new B());
		arr2.add(new A());
		arr2.add(new A());
		arr2.add(new A());
		arr2.add(new A());
		
		for(int i = 0; i < arr2.size(); i++) {
			Object o = arr2.get(i);
			if(o instanceof A) {
				((A)o).go();
			}
			else {
				((B)o).go();
			}
		}
	}
}
