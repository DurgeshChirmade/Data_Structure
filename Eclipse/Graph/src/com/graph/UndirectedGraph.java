package com.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UndirectedGraph {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private int[] stk;
	private int top;
	private int a[][];
	private int nov;
	private int noe;
	private int[] visited;
	private int size;

	public UndirectedGraph() {
		this.size = 100;
		this.stk = new int[size];
		this.top = -1;
		this.a = new int[size][size];
		this.nov = 0;
		this.noe = 0;
		this.visited = new int[size];
	}

	public boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("\nStack is Full.");
		} else {
			stk[++top] = item;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("\nStack is empty.");
			return -1;
		} else {
			return stk[top--];
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("\nStack is empty.");
			return -1;
		} else {
			return stk[top];
		}
	}

	public void accept() throws Exception {

		System.out.print("How many vertices : ");
		nov = Integer.parseInt(br.readLine());

		System.out.print("How many edges : ");
		noe = Integer.parseInt(br.readLine());

		for (int k = 1; k <= noe; k++) {
			System.out.print("Enter Edge Vi : ");
			int i = Integer.parseInt(br.readLine());
			System.out.print("Enter Edge Vj : ");
			int j = Integer.parseInt(br.readLine());

			a[i][j] = 1;
			a[j][i] = 1;
		}
	}

	public void display() {

		System.out.println("Adjacency Matrix : ");
		for (int i = 0; i < nov; i++) {
			for (int j = 0; j < nov; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void dfs(int start) {

		System.out.print("DFS [Start V" + start + "]");
		System.out.print(start + " ");

		visited[start] = 1;
		push(start);

		while (!isEmpty()) {
			int i = peek();
			int status = 0;

			for (int j = 0; j < nov; j++) {
				if (a[i][j] == 1 && visited[j] == 0) {
					System.out.print(j + " ");
					visited[j] = 1;
					push(j);
					status = 1;

					break;
				}
			}
			if (status == 0) {
				pop();
			}
		}
		System.out.println();
	}

}
