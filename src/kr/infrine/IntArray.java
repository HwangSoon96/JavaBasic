package kr.infrine;

public class IntArray { // int �� �迭�� �����ϰ� �ٷ�� ����� ������ Ŭ����
	
	private int count;
	private int[] arr;
	
	public IntArray() { // ���� IntArray()�� �ƹ� ���� �Է����� ������ 10�� ����.
		this(10);
	}
	
	public IntArray(int init) { // IntArray(3)�� �ϸ� �迭�� ���̰� 3�� �迭�� ���������.
		arr = new int[init]; // -> int ���� �ƴ� Object�� �迭�� �̿��ϸ� int�� �Ӹ� �ƴ϶� �ٸ� ��� ���� �� ���� �� �ִ� API�� ���������. -> ArrayList API
	}
	
	public void add(int data) { // .add(10)�� �ϸ� �迭[0]�� 10�� ����.
		arr[count++] = data;
	}
	
	public int get(int index) { // .get(0)�� �ϸ� �迭[0]�� ���� �����Ѵ�.
		return arr[index];
	}
	
	public int size() { // .size()�� �ϸ� �迭�� ���̸� �����Ѵ�.
		return count;
	}

}
