import kr.tpc.MemberVO;

public class TPC16 {
	public static void main(String[] args) {
		// 이 경우 setter 메서드가 하는 일을 오버로딩 메서드가 한번에 다 한다.
		MemberVO m = new MemberVO("홍길동", 40, "010-1111-1111", "서울");
		
		System.out.println(m.toString()); // 객체의 모든 정보 출력
		
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-2222-2222");
		m1.setAddr("광주");
		
		System.out.print(m1.getName() + "\t");
		System.out.print(m1.getAge() + "\t");
		System.out.print(m1.getTel() + "\t");
		System.out.println(m1.getAddr());
		System.out.println(m1.toString());
		System.out.println(m1); // toString메서드 있으면 m1만 쳐도 toString 메서드로 나온다
	}
}
