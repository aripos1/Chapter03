package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {

		Object obj = new Object();
		Object obj2 = new Object();

		// int hc = obj.hashCode();
		System.out.println(obj.hashCode()); // 당분간 주소로 생각
		System.out.println(obj2.hashCode());

		System.out.println(obj.getClass()); // 클래스 정보

		System.out.println(obj.toString()); // java.lang.Object@327471b5

		System.out.println(obj.equals(obj2));
	}
}
