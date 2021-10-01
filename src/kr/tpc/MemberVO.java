package kr.tpc;

public class MemberVO {
	// 1. 정보 은닉
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	// 2. 기본 생성자 메서드 (기본적으로 생성되지만 오버로딩 메서드가 있으면 생성되지 않으니 이렇게 해준다.)
	public MemberVO() { }
	
	// 3. 초기화 하기 쉽게 오버로딩(중복정의) 메서드를 선언한다. (우클릭 -> source -> constructor using fields로 생성 가능)
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	// 4. setter, getter method, 우클릭 -> source에서 생성 가능
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	// 5. 현재 객체의 정보를 한번에 출력해주는 메서드 (디버깅용), 우클릭 -> source에서 생성 가능
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
}
