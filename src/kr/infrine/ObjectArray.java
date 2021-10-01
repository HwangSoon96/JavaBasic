package kr.infrine;

public class ObjectArray {
	
	private int count;
	private Object[] arr;
	
	public ObjectArray() {
		this(10);
	}
	
	public ObjectArray(int init) {
		arr = new Object[init];
	}
	
	public void add(Object data) {
		arr[count++] = data;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	
	public int size() { // .size()를 하면 배열의 길이를 리턴한다.
		return count;
	}

}
