import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TPC55 {
	public static void main(String[] args) {
		
		// try-with-resources 블럭 -> 밑에 형식처럼 () 안에 io 객체 선언 후 예외가 발생하지 않는다면 자동으로 close 메서드 실행해준다.
		//try(	) {	}
		// catch(Exception e) {	}
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt")); // -> 여러가지 데이터 타입을 받아서 파일에 저장 가능
		) {
			out.writeInt(100); // 정수(4바이트) 저장
			out.writeBoolean(true); // 불린 타입(1바이트) 저장
			out.writeDouble(50.5);// 더블 타입(8바이트) 저장
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
