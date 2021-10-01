import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TPC54 {
	public static void main(String[] args) {
		
		// 파일로 부터 512byte씩 읽어들여 파일에 512byte씩 저장하는 프로그램
		long startTime = System.currentTimeMillis();
		
		try {
			FileInputStream fis = new FileInputStream("src/TPC54.java"); // 현재 자바 파일을 바이트 단위로 읽어온다.
			FileOutputStream fos = new FileOutputStream("byte2.txt"); // 아무런 경로 주지 않으면 프로젝트 경로에 생성된다.
			
			int readCount;
			byte[] buffer = new byte[512]; // 앞의 운영체제의 특성 때문에 파일을 읽어올때는 512 바이트의 배수로 읽어오는 것이 좋다.
			while((readCount = fis.read(buffer)) != -1) { // 파일이 끝날때까지(-1을 리턴할때까지) 파일을 바이트 단위로 읽어서 readCount에 넣어준다.
				fos.write(buffer, 0, readCount); // buffer의 0번째부터, readCount 길이 만큼 써준다.
												 // Ex) 만약 524 바이트의 파일이 있다면, 맨처음 읽어올때 512 바이트 만큼 읽어와서 readCount에 512를 넣어주고,
												 // 512 바이트 만큼 써준다 + 나머지 12바이트 만큼 읽어와서 readCount에 12 넣어주고, 12 바이트 만큼 써준다.
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
