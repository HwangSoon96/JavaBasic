package kr.tpc;

public class JavaOracle implements Dbconnect { // JDBC 드라이버 클래스, 보통은 벤더사에서 직접 다운로드 받아야 한다.(jar 파일로 배포)

	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("Oracle DB가 접속됩니다.");
		
	}

}
