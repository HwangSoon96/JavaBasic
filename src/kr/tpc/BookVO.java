package kr.tpc;
// å(Object) -> ����, ����, ���ǻ�, ������ ��, ...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	// �⺻ ������ �޼��� �����Ǿ� ����.
	// �⺻ ������ �޼���� ���� �̸��� �޼��尡 �ϳ��� ���ǵǾ� ������ �⺻ ������ �޼���� ���� X.
	// ���� �� �Ʒ� �Ű������� �޴� ������ �޼��带 �����ߴٸ� �⺻ ������ �޼��� ������ �ϴ� �޼��嵵 ���� ������ָ� �ɵ�.
	
	public BookVO() {
		// ������ �޼��忡���� �ʱ�ȭ �۾�
		this.title = "�ڹ�";
		this.price = 14000;
		this.company = "������";
		this.page = 780;
	}
	
	// ������ �޼����� �ߺ�����(overloading) -> �ϳ��� Ŭ���� �ȿ� �̸��� ���� �޼��尡 ������ �����ϴ� ��. ��Ȯ���� �Ű������� ������ �ٸ��ų� �Ȱ��Ƶ� ������ Ÿ���� �ٸ� ��.
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
