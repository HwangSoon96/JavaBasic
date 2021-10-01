import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TPC58 {
	public static void main(String[] args) {
		
		// char ���� �����
		// BufferedReader - ���پ� �Է� �ޱ����� Ŭ����
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/TPC58.java"));
			pw = new PrintWriter(new FileWriter("test.txt")); // �� �κ��� ���ڷ����� ���� ���� �׳� pw = new PrintWriter("test.txt); �ᵵ �ȴ�.
			
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
