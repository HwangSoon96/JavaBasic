public class TPC44 {
	public static void main(String[] args) {
		
		// StringBuffer의 메서드 체이닝
		StringBuffer sb = new StringBuffer();
		sb.append("hello"); // 스트링 버퍼에 추가
		sb.append(" ");
		sb.append("world");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = sb2.append("hello"); // 자기 자신을 리턴하기 때문에 sb2랑 sb3는 서로 같다
		if(sb2 == sb3) {
			System.out.println("sb2 == sb3");
		}
		
		String str2 = new StringBuffer().append("hello").append(" ").append("world").toString(); // 메서드 체이닝, 자기자신을 리턴하여 계속해서 자신의 메서드를 호출하는 방식
																								 // 그래서 계속 StringBuffer가 가진 메서드 계속 붙일 수 있다.
		System.out.println(str2);
		
	}
}
