import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		// int, float, char, boolean -> PDT
		int a;
		a= 10;
		
		// å�̶�� �ڷ����� ������. (UDDT) -> class�� �̿�
		BookDTO b = new BookDTO(); // ��ü ����
		b.title = "�ڹ�";
		b.price = 17000;
		b.company = "����";
		b.page = 670;
		
		System.out.print(b.title + "\t");
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);

	}
}
