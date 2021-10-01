public class TPC07 {
	public static void main(String[] args) {
		
		int a = 20;
		float b = 56.7f;
		// a + b = ?
		float v = sum(a, b); // Call By Value, 값을 전달하는 방법.
		System.out.println(v);
		
		int[] arr = {1, 2, 3, 4, 5}; // 이렇게 선언하면 미리 값 넣어서 배열 생성 가능
		// 배열의 총합 = ?
		int vv = arrSum(arr); // Call By Reference, 번지를 전달하는 방법.
		System.out.println(vv);

	}
	
	public static float sum(int a, float b) {
		float v = a + b;
		return v;
	}
	
	private static int arrSum(int[] x) { // 같은 클래스 안에서는 private / public 상관 없다.
		int hap = 0;
		for(int i = 0; i < x.length; i++) {
			hap += x[i];
		}
		return hap;
	}
	
}
