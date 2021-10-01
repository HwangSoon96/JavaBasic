import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TPC58 {
	public static void main(String[] args) {
		
		// char 단위 입출력
		// BufferedReader - 한줄씩 입력 받기위한 클래스
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/TPC58.java"));
			pw = new PrintWriter(new FileWriter("test.txt")); // 이 부분은 데코레이터 패턴 없이 그냥 pw = new PrintWriter("test.txt); 써도 된다.
			
			String line;
			while((line = br.readLine()) != null) {
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
