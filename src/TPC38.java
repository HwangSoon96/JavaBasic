import java.util.*;
import kr.tpc.BookDTO;

public class TPC38 {
	public static void main(String[] args) {
		
		// ArrayList list = new ArrayList();
		List<BookDTO> list = new ArrayList<BookDTO>(1); // List�� �θ� Ŭ���� �̹Ƿ� �̷��Ե� ���� ����, ���� 1�� �����ص� ������ ���� ���� �ڵ����� �þ��.
														// Ÿ�� �ڿ� <Ÿ��> ������ Object �迭�̶� �� Ÿ�Ը� ���� �� �ִ�.
														// Object[] --> BookDTO[]
		
		list.add(new BookDTO("�ڹ�", 12000, "������", 600)); // Object Ŭ������ �޴°Ŷ� ���� �ٸ� Ŭ������ �� ���� �� �ִ�.
		list.add(new BookDTO("C���", 17000, "������", 700)); // �׷��� �ǹ������� �� �����θ� �޵��� �����ؾ� �Ѵ�. �׷��� ���� (���׸�)
		list.add(new BookDTO("Python", 15000, "������", 690));
		
		for(int i = 0; i < list.size(); i++) {
			// BookDTO vo = (BookDTO)list.get(i); // downcasting ���� ǥ��
			Object o = list.get(i);
			BookDTO vo = (BookDTO)o;
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			// BookDTO vo = (BookDTO)list.get(i); // downcasting ���� ǥ��
			
			// Object o = list.get(i);
			// BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i); // ���׸� ����ϸ� downcasting�� �ʿ����.
			System.out.println(vo.title + "\t" + vo.price + "\t" + vo.company + "\t" + vo.page);
		}
		
	}
}
