package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {

		int a = 3;
		System.out.println(a);

		Integer i = new Integer(3);
		System.out.println(i);

		Integer sum = new Integer(3) + new Integer(5);
		System.out.println(sum);

		Integer v01 = 3;

		int v02 = i;

		Integer r01 = 100;
		int result = r01.parseInt("1234567");
		System.out.println(result + 3);

		int result02 = Integer.parseInt("1234547");
		System.out.println(result02);
		
		
		String s99 = String.valueOf(5555);
		System.out.println(s99);	
		System.out.println(s99+5);
		
		String s100 = ""+5555;
		System.out.println(s100+9);	
	}
}
