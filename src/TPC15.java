import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m = new MemberVO();
		// ��������� public�̸� �̷��� ���� ���� ���� & �߸��� �����Ͱ� �Էµ� �� �ִ�
		/*
		m.name = "ȫ�浿";
		m.age = 1000;
		m.tel = "010-1111-1111";
		m.addr = "����";
		*/
		
		// setter�� getter�� �̿��� ���� ����
		m.setName("ȫ�浿");
		m.setAge(50); // ���⼭�� 1000�� ������ �� ������ �޼��忡 Ư�� ������ �ɾ� �Ÿ� �� �ִ�
		m.setTel("010-1111-1111");
		m.setAddr("����");
		
		System.out.print(m.getName() + "\t");
		System.out.print(m.getAge() + "\t");
		System.out.print(m.getTel() + "\t");
		System.out.println(m.getAddr());

	}
}
