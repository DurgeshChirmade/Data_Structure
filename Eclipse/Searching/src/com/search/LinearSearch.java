package com.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearSearch {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void accept(int arr[]) throws Exception {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter Data at " + i + " pos : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int linearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) throws Exception {

		System.out.print("How many numbers you want to store : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		accept(arr);

		System.out.print("Your Data : ");
		display(arr);

		System.out.print("Which number you want to search : ");
		int key = Integer.parseInt(br.readLine());

		int pos = linearSearch(arr, key);

		if (pos == -1) {
			System.out.println("Your data " + key + " is not found!!!");
		} else {
			System.out.println("Your data " + key + " is found at " + (pos+1) + " position.");
		}
	}

}
