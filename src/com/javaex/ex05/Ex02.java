package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd");
		String b = new String(" ,efg ");
		String c = new String("hijk");

//		System.out.println(a.concat(b));
//		System.out.println(b.concat(a));

		a = a.concat(b);

		a = a.trim(); // 양쪽 끝 공백 없에기 (회원가입 시 사용 가능)
//		System.out.println(a);

		a = a.replace("ab", "12");
		System.out.println(a);
		System.out.println("==============");

		String[] sArr = a.split(",");
		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]);
		}
		System.out.println("==============");
		
		String str = "Hello java!";
		
		str.substring(3);
		String result = str.substring(3);
		System.out.println(result);
		String result1 = str.substring(1,4);
		System.out.println(result1);
		
		char result2 = str.charAt(8);
		System.out.println(result2);
	}
}
