package com.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderedLinearSearch {

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

	public static void bubbleSort(int arr[]) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static int orderedLinearSearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
			if (arr[i] > key) {
				break;
			}
		}

		return -1;
	}

	public static void main(String[] args) throws Exception {

		System.out.print("How many numbers you want to store : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		accept(arr);

		bubbleSort(arr);

		System.out.print("Your data after sort : ");
		display(arr);

		System.out.print("Which number you want to search : ");
		int key = Integer.parseInt(br.readLine());

		int pos = orderedLinearSearch(arr, key);

		if (pos == -1) {
			System.out.println("Your data " + key + " is not found!!!");
		} else {
			System.out.println("Your data " + key + " is found at " + (pos + 1) + " position.");
		}
	}

}
