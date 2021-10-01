public class TPC02 {
	public static void main(String[] args) {
		// 프로그래밍의 3대 요소 : 변수, 자료형(DataType), 할당(=)
		// 1 + 1 = 2 를 계산하는 프로그램
		int a, b, c; // 3개의 변수를 int형으로 선언 
					 // -> 메모리의 기억 공간에 a, b, c를 int형에 맞게 크기와 종류를 저장
		a = 1;
		b = 1;
		c = a + b;
		System.out.println(c);
		
		float f;
		f = 34.5f; // 자바는 기본적으로 실수를 double로 생각하기 때문에 float 형은 뒤에 f 붙여줘야 한다
		System.out.println(f);
		
		char d;
		d = 'A'; // 작은따옴표는 문자, 큰따옴표는 문자열
		System.out.println(d);
		
		boolean g;
		g = true;
		System.out.println(g);
		
		// PDT(primitive data type) 기본 자료형 : 기본적으로 자바 컴파일러에서 제공해주는 자료형
		
		// Book bk; <- 책제목, 저자, 출판사 등의 정보를 가진 책이라는 자료형
		
		// UDDT(user define data type) 사용자 정의 자료형 : 사용자가 정의한 자료형
	}
}