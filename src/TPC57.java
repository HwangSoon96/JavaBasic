import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TPC57 {
	public static void main(String[] args) {
		
		// char ���� ����� -> Ŭ���� �̸��� Reader�� Writer�� ����
		// System.in - Ű���带 �ǹ� (InputStream)
		// BufferedReader - ���پ� �Է� �ޱ����� Ŭ����
		// BufferedReader Ŭ������ �����ڴ� InputStream�� �Է¹޴� �����ڰ� ����.
		// System.in�� InputStream Ÿ���̹Ƿ� BufferedReader�� �����ڿ� �ٷ� �� �� �����Ƿ� InputStreamReader Ŭ������ �̿��ؾ���. -> ���ڷ����� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null; // try�� ���� � ��� �ȿ��� ���� �����ϸ� �� ��� �ȿ����� ��� �����ϴ� -> ��� �ٱ����� ����ϰ� ������ ������ �ٱ����� ����!
		try {
			line = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(line);
		
	}
}
