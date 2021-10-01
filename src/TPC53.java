import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TPC53 {
	public static void main(String[] args) {
		
		// Java IO 패키지
		// Input Data -> 프로그램 상으로 들어오는 모든 값, Output Data -> 프로그램 상에서 밖으로 나가는 모든 값
		
		// byte단위 입출력클래스는 모두 InputStream과 OutputStream이라는 추상클래스를 상속받아 만들어집니다.
		// 문자(char)단위 입출력클래스는 모두 Reader와 Writer라는 추상클래스를 상속받아 만들어집니다.
		
		// 4가지 추상클래스(InputStream,OutputStream,Reader,Writer)를 받아들이는 생성자가 있다면, 다양한 입출력방법을 제공하는 클래스입니다.
		// DataInputStream, DataOutputStream같은 클래스를 보면 다양한 데이터 형을 입력받고 출력합니다.
		// PrintWriter는 다양하게 한줄 출력하는 pintln()메소드를 가지고있습니다.
		// BufferedReader는 한줄 입력받는 readLine()메소드를 가집니다.
		// 이런 클래스들은 다양한 방식으로 입력하고, 출력하는 기능을 제공합니다. 이런 클래스를 장식하는 클래스라고 합니다.
		
		// 4가지 클래스를 받아들이는 생성자가 없다면, 어디로부터 입력받을 것인지, 어디에 쓸것인지를 나타내는 클래스입니다.
		// 파일로 부터 입력받고 쓰기 위한 클래스 : FileInputStream, FileOutputStream, FileReader, FileWriter
		// 배열로 부터 입력받고 쓰기 위한 클래스 : ByteArrayInputStream, ByteArrayOutputStream, CharReader, CharWriter
		// 해당 클래스들은 어디로부터, 어디에라는 대상을 지정할 수 있는 IO클래스입니다. 이런 클래스를 장식대상 클래스라고 합니다.

		// 파일로 부터 1byte씩 읽어들여 파일에 1byte씩 저장하는 프로그램
		long startTime = System.currentTimeMillis();
		
		// 파일이 존재하지 않을 경우를 대비해 예외처리를 해주어야 한다.
		try {
			FileInputStream fis = new FileInputStream("src/TPC53.java"); // 현재 자바 파일을 바이트 단위로 읽어온다.
			FileOutputStream fos = new FileOutputStream("byte.txt"); // 아무런 경로 주지 않으면 프로젝트 경로에 생성된다.
			
			int readCount;
			while((readCount = fis.read()) != -1) { // 파일이 끝날때까지(-1을 리턴할때까지) 파일을 바이트 단위로 읽어서 readCount에 넣어준다.
													// -> 정확히 int 형은 4바이트인데 이 4바이트 중 끝 바이트에 바이트 값을 담아 오는 것이다.
				fos.write(readCount); // 읽어들인 값을 써준다.
			}
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		// 운영체제에게 한 바이트씩 읽어오라고 하면 보통 512 바이트를 읽어와서 나머지를 버리고 한 바이트를 가져온다.
		// 따라서 한 바이트씩 읽어오면 한 바이트를 읽을때마다 512 바이트를 읽어오는 것이기 때문에 속도가 느리다.
		
	}
}