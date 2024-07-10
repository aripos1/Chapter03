package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {

		String s00 = new String("안녕하세요");
		String s01 = new String("안녕하세요");
		System.out.println(s00 == s01);
		System.out.println(s00.equals(s01));

		String s03 = "안녕";
		String s04 = "안녕";
		System.out.println(s03 == s04);
		System.out.println(s03.equals(s04));

		s03 = "안녕!";
		System.out.println(s03 == s04);
		System.out.println(s03.equals(s04));
		
		s04 = null;
		if("안녕".equals(s04)) {
			System.out.println("같다");
		}else {
			System.out.println("다시 입력하세요");
		}
		
		String str00 = "hi";
		String str01 = "굿모닝";
		String str02 = "굿모닝";

		System.out.println(str01);
		System.out.println(str02);

		str01 = "굿이브닝";
		System.out.println(str01);
		System.out.println(str02);
	}
}
