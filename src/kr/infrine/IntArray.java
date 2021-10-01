package kr.infrine;

public class IntArray { // int 형 배열을 저장하고 다루는 기능을 포함한 클래스
	
	private int count;
	private int[] arr;
	
	public IntArray() { // 만약 IntArray()에 아무 값도 입력하지 않으면 10이 들어간다.
		this(10);
	}
	
	public IntArray(int init) { // IntArray(3)을 하면 배열의 길이가 3인 배열이 만들어진다.
		arr = new int[init]; // -> int 형이 아닌 Object형 배열을 이용하면 int형 뿐만 아니라 다른 모든 형도 다 받을 수 있는 API가 만들어진다. -> ArrayList API
	}
	
	public void add(int data) { // .add(10)을 하면 배열[0]에 10이 들어간다.
		arr[count++] = data;
	}
	
	public int get(int index) { // .get(0)을 하면 배열[0]의 값을 리턴한다.
		return arr[index];
	}
	
	public int size() { // .size()를 하면 배열의 길이를 리턴한다.
		return count;
	}

}
