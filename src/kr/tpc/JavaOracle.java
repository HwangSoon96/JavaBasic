package kr.tpc;

public class JavaOracle implements Dbconnect { // JDBC ����̹� Ŭ����, ������ �����翡�� ���� �ٿ�ε� �޾ƾ� �Ѵ�.(jar ���Ϸ� ����)

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB�� ���ӵ˴ϴ�.");
		
	}

}
