import kr.tpc.*;

public class TPC29 {
	public static void main(String[] args) {
		
		// Oracle, MySQL�� �����ϱ� ���ؼ��� �������� �����ϴ� Driver class �ʿ�
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "ididid", "pwpw12345");
		
		conn = new JavaMySQL();
		conn.getConnection("url2", "idid", "pwpw1111");

	}
}
