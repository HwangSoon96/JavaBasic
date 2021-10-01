import kr.tpc.BookDTO;

public class TPC14 {
	public static void main(String[] args) {
        // å -> class (BookDTO) -> ��ü -> �ν��Ͻ�
		String title = "������";
		int price = 25000;
		String company = "������";
		int page = 890;
		
		BookDTO dto; // dto�� ��ü������ ����Ű�� ���� �����Ƿ� object(��ü) ��� �θ���.
		dto = new BookDTO(title, price, company, page); // dto�� ����Ű�� ��ü�� ����������Ƿ�(��ü ����) Instance ��� �θ���.
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) { // �̷��� dto�� �ٸ� �޼��峪 Ŭ������ �����͸� �̵���ų �� ����.
		System.out.print(dto.title + "\t");
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.println(dto.page);
	} 
}
 