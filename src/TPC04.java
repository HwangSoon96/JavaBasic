public class TPC04 {
	public static void main(String[] args) {
		// 데이터를 이동하라. (변수 VS 배열)
		int a, b, c;
		a = 10;
		b = 20;
		c = 30;
		// a + b + c = ? 를 메서드 hap()에서 처리해보시오.
		hap(a, b, c); // 메서드 호출 x = a, y = b, z = c
		
		int[] arr;
		arr = new int[3];
		// int[] arr = new int[3]; 으로 한 줄로 표현 가능
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		
		hap2(arr); // hap2에 arr을 통째로 넘겨버려서 처리한다.
		
	}
	public static void hap(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}
	
	public static void hap2(int[] x) {
		// 배열을 통째로 받았으니 반복문 활용하여 이용 가능
		//int sum = x[0] + x[1] + x[2];
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
}
