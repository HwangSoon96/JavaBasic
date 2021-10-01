import kr.poly.A;

public class TPC30 {
	public static void main(String[] args) {
		
		A a = new A();
		a.dispaly();
		System.out.println(a.toString()); // 만약 toStoring 재정의가 안되어 있다면 객체의 메모리 번지가 나온다. (kr.poly.A@5ca881b5)
		System.out.println(a); // toStirng 생략 가능
		
		Object obj = new A(); // upcasting
		((A)obj).dispaly(); // downcasting
		System.out.println(obj.toString()); // 만약 toStoring 재정의가 안되어 있다면 객체의 메모리 번지가 나온다. (kr.poly.A@5ca881b5)
		System.out.println(obj); // toStirng 생략 가능

	}
}
