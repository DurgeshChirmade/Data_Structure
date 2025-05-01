package com.linear;

public class SecondMain {

	public static void main(String[] args) throws Exception {

		SecondStack s = new SecondStack();

		s.initStack();

		for (int i = 0; i < 26; i++) {
			s.push((char) (65 + i));
		}

		System.out.println("Reverse Characters : ");
		for (int i = 0; i < 26; i++) {

			System.out.print((char) (s.pop()) + " ");
		}
		System.out.println();
	}

}
