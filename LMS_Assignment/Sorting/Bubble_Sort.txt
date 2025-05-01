package com.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void accept(int[] arr, int size) throws Exception {
		for (int i = 0; i < size; i++) {
			System.out.print("Enter Data : ");
			arr[i] = Integer.parseInt(br.readLine());
		}
	}

	public static void display(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int arr[], int size) {
		int totalSwaps = 0;
		int passes = 0;

		for (int i = size - 1; i > 0; i--) {
			passes++;

			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					totalSwaps++;
				}
			}

			System.out.print("After Pass " + passes + ": ");
			display(arr, size);

			System.out.println("Total number of swaps: " + totalSwaps);
			System.out.println("Total number of passes: " + passes);
		}
	}

	public static void main(String args[]) throws Exception {

		System.out.print("How many elements you want to store : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		accept(arr, size);

		System.out.print("Before Sort : ");

		display(arr, size);

		bubbleSort(arr, size);

		System.out.print("After Sort : ");

		display(arr, size);
	}

}
