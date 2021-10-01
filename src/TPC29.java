import kr.tpc.*;

public class TPC29 {
	public static void main(String[] args) {
		
		// Oracle, MySQL을 연동하기 위해서는 벤더에서 제공하는 Driver class 필요
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "ididid", "pwpw12345");
		
		conn = new JavaMySQL();
		conn.getConnection("url2", "idid", "pwpw1111");

	}
}
