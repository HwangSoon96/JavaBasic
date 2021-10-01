public class TPC67 {
	public static void main(String[] args) {
		
		// �������̽� �߿��� �޼ҵ带 �ϳ��� ������ �ִ� �������̽��� �Լ��� �������̽���� �Ѵ�.
		// �����带 ���鶧 ����ϴ� Runnable �������̽��� ��� run()�޼ҵ带 �ϳ��� ������ �ִ�.
		// ���ٽ�
		new Thread(new Runnable() { // �ڹٴ� �޼��常 �Ű������� ������ ��� X -> ���� run() �޼��带 ������ �ִ� Runnable ��ü�� �Ű������� ����
			
			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start(); // new Thread( ~~~ ) ��ȣ�� ���⼭ ������.
		
		// ()->{ ..... } �κ��� ���ٽ�, �ٸ����� �͸� �޼ҵ�
		// JVM�� Thread�����ڸ� ���� ()->{} �� �������� ����� �߷��Ѵ�.
		// Thread������ api�� ���� Runnable�������̽��� �޾Ƶ��̴� ���� �� �� �ִ�.
		// JVM�� Thread �����ڰ� Runnable �������̽��� ������ ���� �;� �ϴ� ���� �˰� �ǰ� ���ٽ��� Runnable�� �����ϴ� ��ü�� �ڵ����� ���� �Ű������� �־��ش�.
		// ���� ����� ���ٽ����� ǥ��
		new Thread(()-> {
				for(int i = 0; i < 10; i++) {
					System.out.println("hello Lambda");
				}
		}).start();
		
	}
}
