public class TPC45 {
	public static void main(String[] args) {
		
		// 반복문 안에서의 String과 StringBuffer
		String str1 = "hello world";
		String str2= str1.substring(5); // 5번째부터 잘라서 가져온다
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = str1 + str2;
		System.out.println(str3);
		
		String str4 = new StringBuffer().append(str1).append(str2).toString(); // 위의 문자열끼리 더하는 것을 내부적으로 수행하는 과정, 스트링버퍼 선언해서 append 후에 toString.
		System.out.println(str4);
		
		String str5 ="";
		for(int i = 0; i < 100; i++) {
			str5 = str5 + "*"; // 이렇게 하게 되면 반복문을 한번 돌때마다 StringBuffer 객체가 생성되어 append 되어진다 -> new 연산자 많이 쓰일수록 속도는 느려진다.
							   // 반복문 안에서 문자열 다룰때는 StringBuffer로 다루는 것이 더 효율적이지 않을까 생각해야 한다.
		}
		System.out.println(str5);
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			sb.append("*"); // 위의 과정을 효율적으로 하려면 우선 StringBuffer에다 append를 다 시키고 맨 마지막에 toString 메서드를 이용하여 문자열로 바꾼후 사용하는 것이 더 효율적이다.
		}
		String str6 = sb.toString();
		System.out.println(str6);
		
	}
}
