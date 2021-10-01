import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TPC57 {
	public static void main(String[] args) {
		
		// char 단위 입출력 -> 클래스 이름이 Reader나 Writer로 끝남
		// System.in - 키보드를 의미 (InputStream)
		// BufferedReader - 한줄씩 입력 받기위한 클래스
		// BufferedReader 클래스의 생성자는 InputStream을 입력받는 생성자가 없다.
		// System.in은 InputStream 타입이므로 BufferedReader의 생성자에 바로 들어갈 수 없으므로 InputStreamReader 클래스를 이용해야함. -> 데코레이터 패턴
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null; // try와 같은 어떤 블록 안에서 변수 선언하면 그 블록 안에서만 사용 가능하다 -> 블록 바깥에서 사용하고 싶으면 선언은 바깥에서 하자!
		try {
			line = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(line);
		
	}
}
