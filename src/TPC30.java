import kr.poly.A;

public class TPC30 {
	public static void main(String[] args) {
		
		A a = new A();
		a.dispaly();
		System.out.println(a.toString()); // ���� toStoring �����ǰ� �ȵǾ� �ִٸ� ��ü�� �޸� ������ ���´�. (kr.poly.A@5ca881b5)
		System.out.println(a); // toStirng ���� ����
		
		Object obj = new A(); // upcasting
		((A)obj).dispaly(); // downcasting
		System.out.println(obj.toString()); // ���� toStoring �����ǰ� �ȵǾ� �ִٸ� ��ü�� �޸� ������ ���´�. (kr.poly.A@5ca881b5)
		System.out.println(obj); // toStirng ���� ����

	}
}
