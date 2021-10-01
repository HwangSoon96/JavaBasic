package kr.tpc;

public class MemberVO {
	// 1. ���� ����
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	// 2. �⺻ ������ �޼��� (�⺻������ ���������� �����ε� �޼��尡 ������ �������� ������ �̷��� ���ش�.)
	public MemberVO() { }
	
	// 3. �ʱ�ȭ �ϱ� ���� �����ε�(�ߺ�����) �޼��带 �����Ѵ�. (��Ŭ�� -> source -> constructor using fields�� ���� ����)
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	// 4. setter, getter method, ��Ŭ�� -> source���� ���� ����
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

	// 5. ���� ��ü�� ������ �ѹ��� ������ִ� �޼��� (������), ��Ŭ�� -> source���� ���� ����
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
}
