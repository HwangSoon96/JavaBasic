import java.lang.String;
import java.lang.System;

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

import java.lang.*; // java.lang의 모든 클래스 import, 디폴트 패키지(생략)
public class TPC19 {
	public static void main(String[] args) {
		
		// 1. JAVA에서 제공해주는 class들.. API
		// 문자열(String)
		String str = new String("APPLE"); // java.lang.String <- 이것이 정확한 경로이지만 자바에서는 자주 쓰는 클래스들을 디폴트 패키지라 칭하고 자동으로 import
		System.out.println(str.toLowerCase()); // java.lang.System, apple
		
		// 2. 직접 만들어서 사용하는 class들... DTO(Data Transfer Object)/VO(Value Object), DAO(Data Access Object, Utility
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 class들... API
		// Gson -> json, JavaTPC의 build path의 라이브러리에서 jar 파일 추가한다. (다운로드 링크 : https://mvnrepository.com/ )
		// Gson은 객체를 json 구조로 변경해주는 라이브러리인듯
		Gson g = new Gson();
		BookVO vo = new BookVO("자바", 13000, "영진", 800);
		String json = g.toJson(vo);
		System.out.println(json);
		

	}
}
