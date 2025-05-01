package com.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterStack {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		DynamicStack d = new DynamicStack();

		System.out.print("Enter your String : ");
		String data = br.readLine();

		for (int i = 0; i < data.length(); i++) {
			int val = data.charAt(i);
			d.push(val);
		}

		System.out.print("Reverse String : ");
		for (int i = 0; i < data.length(); i++) {
			System.out.print((char) (d.pop()));
		}

	}

}
