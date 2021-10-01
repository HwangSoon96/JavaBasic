import java.lang.String;
import java.lang.System;

import com.google.gson.Gson;

import kr.tpc.BookVO;
import kr.tpc.MyUtil;

import java.lang.*; // java.lang�� ��� Ŭ���� import, ����Ʈ ��Ű��(����)
public class TPC19 {
	public static void main(String[] args) {
		
		// 1. JAVA���� �������ִ� class��.. API
		// ���ڿ�(String)
		String str = new String("APPLE"); // java.lang.String <- �̰��� ��Ȯ�� ��������� �ڹٿ����� ���� ���� Ŭ�������� ����Ʈ ��Ű���� Ī�ϰ� �ڵ����� import
		System.out.println(str.toLowerCase()); // java.lang.System, apple
		
		// 2. ���� ���� ����ϴ� class��... DTO(Data Transfer Object)/VO(Value Object), DAO(Data Access Object, Utility
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. �ٸ� ȸ�翡�� ����� ���� class��... API
		// Gson -> json, JavaTPC�� build path�� ���̺귯������ jar ���� �߰��Ѵ�. (�ٿ�ε� ��ũ : https://mvnrepository.com/ )
		// Gson�� ��ü�� json ������ �������ִ� ���̺귯���ε�
		Gson g = new Gson();
		BookVO vo = new BookVO("�ڹ�", 13000, "����", 800);
		String json = g.toJson(vo);
		System.out.println(json);
		

	}
}
