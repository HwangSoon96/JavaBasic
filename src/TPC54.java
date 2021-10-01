import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TPC54 {
	public static void main(String[] args) {
		
		// ���Ϸ� ���� 512byte�� �о�鿩 ���Ͽ� 512byte�� �����ϴ� ���α׷�
		long startTime = System.currentTimeMillis();
		
		try {
			FileInputStream fis = new FileInputStream("src/TPC54.java"); // ���� �ڹ� ������ ����Ʈ ������ �о�´�.
			FileOutputStream fos = new FileOutputStream("byte2.txt"); // �ƹ��� ��� ���� ������ ������Ʈ ��ο� �����ȴ�.
			
			int readCount;
			byte[] buffer = new byte[512]; // ���� �ü���� Ư�� ������ ������ �о�ö��� 512 ����Ʈ�� ����� �о���� ���� ����.
			while((readCount = fis.read(buffer)) != -1) { // ������ ����������(-1�� �����Ҷ�����) ������ ����Ʈ ������ �о readCount�� �־��ش�.
				fos.write(buffer, 0, readCount); // buffer�� 0��°����, readCount ���� ��ŭ ���ش�.
												 // Ex) ���� 524 ����Ʈ�� ������ �ִٸ�, ��ó�� �о�ö� 512 ����Ʈ ��ŭ �о�ͼ� readCount�� 512�� �־��ְ�,
												 // 512 ����Ʈ ��ŭ ���ش� + ������ 12����Ʈ ��ŭ �о�ͼ� readCount�� 12 �־��ְ�, 12 ����Ʈ ��ŭ ���ش�.
			}
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
	}
}
