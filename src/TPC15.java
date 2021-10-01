import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
		// 멤버변수가 public이면 이렇게 직접 접근 가능 & 잘못된 데이터가 입력될 수 있다
		/*
		m.name = "홍길동";
		m.age = 1000;
		m.tel = "010-1111-1111";
		m.addr = "서울";
		*/
		
		// setter와 getter를 이용한 정보 은닉
		m.setName("홍길동");
		m.setAge(50); // 여기서도 1000을 설정할 수 있지만 메서드에 특정 조건을 걸어 거를 수 있다
		m.setTel("010-1111-1111");
		m.setAddr("서울");
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.println(m.getAddr());

	}
}
