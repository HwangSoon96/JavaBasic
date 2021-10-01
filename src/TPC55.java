import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class TPC55 {
	public static void main(String[] args) {
		
		// try-with-resources �� -> �ؿ� ����ó�� () �ȿ� io ��ü ���� �� ���ܰ� �߻����� �ʴ´ٸ� �ڵ����� close �޼��� �������ش�.
		//try(	) {	}
		// catch(Exception e) {	}
		try (
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt")); // -> �������� ������ Ÿ���� �޾Ƽ� ���Ͽ� ���� ����
		) {
			out.writeInt(100); // ����(4����Ʈ) ����
			out.writeBoolean(true); // �Ҹ� Ÿ��(1����Ʈ) ����
			out.writeDouble(50.5);// ���� Ÿ��(8����Ʈ) ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
