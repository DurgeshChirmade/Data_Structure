package com.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertionSort {

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

	public static void insertionSort(int arr[], int size) {

		int i, j, temp;
		for (i = 1; i < size; i++) {
			temp = arr[i];
			j = 0;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}

			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) throws Exception {

		System.out.print("How many elements you want to store : ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		accept(arr, size);

		System.out.print("Before Sort : ");

		display(arr, size);

		insertionSort(arr, size);

		System.out.print("After Sort : ");

		display(arr, size);

	}

}
