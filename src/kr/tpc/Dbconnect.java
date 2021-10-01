package kr.tpc;

public interface Dbconnect { // JDBC를 위한 인터페이스
    public void getConnection(String url, String user, String password);
}
