import kr.programmers.MyThread3;

public class TPC64 {
	public static void main(String[] args) {
		
		// ������� ��������
		// �����尡 3���� �ִٸ� JVM�� �ð��� �߰� �ɰ� �Ŀ� �ѹ��� ������1��, �ѹ��� ������ 2��, �ѹ��� ������ 3�� ����. �̰Ϳ� ������ �Ͼ�� ���� �����尡 ��� �����ϴ� ��ó�� ���̴� ���̴�.
		// ������� ���డ�ɻ����� Runnable�� ��������� Running���·� ������.
		
		// ����Ǵ� ������ �ȿ��� Thread.sleep()�̳� Object�� ������ �ִ� wait()�޼ҵ尡 ȣ���� �Ǹ� ������� ���ϻ��°� �ȴ�.
		// Thread.sleep()�� Ư���ð��� ������ �ڽ� ������ ���ϻ��¿��� �������� Runnable�̳� Running���°� �ȴ�.
		// Object�� ������ �ִ� wait()�޼ҵ�� �ٸ� �����尡 notify()�� notifyAll()�޼ҵ带 ȣ���ϱ� ������ ���ϻ��¿��� �������� �ʴ´�.
		// wait()�޼ҵ�� ȣ���� �Ǹ� ����͸� ���� ���� �ȴ�. �׷��� ������� �ٸ� �޼ҵ尡 �����Ѵ�.
		
		// �������� run�޼ҵ尡 ����Ǹ�, ������� ����ȴ�. �� Dead���°� �ȴ�.
		// Thread�� yeild�޼ҵ尡 ȣ��Ǹ� �ش� ������� �ٸ� �����忡�� �ڿ��� �纸�ϰ� �ȴ�.
		// Thread�� ������ �ִ� join�޼ҵ带 ȣ���ϰ� �Ǹ� �ش� �����尡 ����� ������ ����ϰ� �ȴ�.
		
		// ������� ��������(join)
		MyThread3 thread = new MyThread3();
		thread.start();
		
		System.out.println("����!");
		
		try {
			thread.join(); // �ش� �����尡 ����� ������ ��� -> ������ ���� �� �������� �ʰ�, MyThread3 �� ������ ������ ��ٸ���.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("����!");
		
	}
}