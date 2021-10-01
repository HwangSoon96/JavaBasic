import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TPC53 {
	public static void main(String[] args) {
		
		// Java IO ��Ű��
		// Input Data -> ���α׷� ������ ������ ��� ��, Output Data -> ���α׷� �󿡼� ������ ������ ��� ��
		
		// byte���� �����Ŭ������ ��� InputStream�� OutputStream�̶�� �߻�Ŭ������ ��ӹ޾� ��������ϴ�.
		// ����(char)���� �����Ŭ������ ��� Reader�� Writer��� �߻�Ŭ������ ��ӹ޾� ��������ϴ�.
		
		// 4���� �߻�Ŭ����(InputStream,OutputStream,Reader,Writer)�� �޾Ƶ��̴� �����ڰ� �ִٸ�, �پ��� ����¹���� �����ϴ� Ŭ�����Դϴ�.
		// DataInputStream, DataOutputStream���� Ŭ������ ���� �پ��� ������ ���� �Է¹ް� ����մϴ�.
		// PrintWriter�� �پ��ϰ� ���� ����ϴ� pintln()�޼ҵ带 �������ֽ��ϴ�.
		// BufferedReader�� ���� �Է¹޴� readLine()�޼ҵ带 �����ϴ�.
		// �̷� Ŭ�������� �پ��� ������� �Է��ϰ�, ����ϴ� ����� �����մϴ�. �̷� Ŭ������ ����ϴ� Ŭ������� �մϴ�.
		
		// 4���� Ŭ������ �޾Ƶ��̴� �����ڰ� ���ٸ�, ���κ��� �Է¹��� ������, ��� ���������� ��Ÿ���� Ŭ�����Դϴ�.
		// ���Ϸ� ���� �Է¹ް� ���� ���� Ŭ���� : FileInputStream, FileOutputStream, FileReader, FileWriter
		// �迭�� ���� �Է¹ް� ���� ���� Ŭ���� : ByteArrayInputStream, ByteArrayOutputStream, CharReader, CharWriter
		// �ش� Ŭ�������� ���κ���, ��𿡶�� ����� ������ �� �ִ� IOŬ�����Դϴ�. �̷� Ŭ������ ��Ĵ�� Ŭ������� �մϴ�.

		// ���Ϸ� ���� 1byte�� �о�鿩 ���Ͽ� 1byte�� �����ϴ� ���α׷�
		long startTime = System.currentTimeMillis();
		
		// ������ �������� ���� ��츦 ����� ����ó���� ���־�� �Ѵ�.
		try {
			FileInputStream fis = new FileInputStream("src/TPC53.java"); // ���� �ڹ� ������ ����Ʈ ������ �о�´�.
			FileOutputStream fos = new FileOutputStream("byte.txt"); // �ƹ��� ��� ���� ������ ������Ʈ ��ο� �����ȴ�.
			
			int readCount;
			while((readCount = fis.read()) != -1) { // ������ ����������(-1�� �����Ҷ�����) ������ ����Ʈ ������ �о readCount�� �־��ش�.
													// -> ��Ȯ�� int ���� 4����Ʈ�ε� �� 4����Ʈ �� �� ����Ʈ�� ����Ʈ ���� ��� ���� ���̴�.
				fos.write(readCount); // �о���� ���� ���ش�.
			}
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		// �ü������ �� ����Ʈ�� �о����� �ϸ� ���� 512 ����Ʈ�� �о�ͼ� �������� ������ �� ����Ʈ�� �����´�.
		// ���� �� ����Ʈ�� �о���� �� ����Ʈ�� ���������� 512 ����Ʈ�� �о���� ���̱� ������ �ӵ��� ������.
		
	}
}