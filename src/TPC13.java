import kr.tpc.Inflearn;

public class TPC13 {
	public static void main(String[] args) {
		
		// Inflearn inf = new Inflearn(); // ��ü ����, �⺻ ������ �޼���� public�̱� ������ ��ü�� �����ȴ�.
		// inf.tpc();
		// inf.java();
		Inflearn.java(); // Ŭ���� �޼���� ��ü ���� ���� ���� �̷��� �ٷ� �� �� �ִ�. (�ν��Ͻ� �޼���� �ٸ��� Ŭ���� �޼���� ���ڰ� ��¦ ������ �ִ�.)

		// Java API ������ private
		
		// System sys = new System();
		System.out.println("���"); // ���� ���� �޼���� private �����ڸ� �̿��Ͽ� �����ϰ� ����� �� �ִ�.
		
		//Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
	}
}
