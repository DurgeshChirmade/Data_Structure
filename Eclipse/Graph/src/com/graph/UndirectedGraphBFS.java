package com.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UndirectedGraphBFS {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private int Q[];
	private int front, rear;
	private int a[][];
	private int nov;
	private int noe;
	private int visited[];
	private int size;

	public UndirectedGraphBFS() {
		this.size = 100;
		this.Q = new int[size];
		this.a = new int[size][size];
		this.nov = 0;
		this.noe = 0;
		front = rear = -1;
		this.visited = new int[size];
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		}
		return false;
	}

	public void enQueue(int item) {
		if (isFull()) {
			System.out.println("\nQueue is Full.");
		} else {
			Q[++rear] = item;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("\nQueue is Empty.");
			return -1;
		} else {
			return Q[++front];
		}
	}

	public void accept() throws Exception {

		System.out.print("How many  Vertices : ");
		nov = Integer.parseInt(br.readLine());

		System.out.print("How many  Edges : ");
		noe = Integer.parseInt(br.readLine());

		for (int k = 1; k <= noe; k++) {
			System.out.print("Enter Edge Vi : ");
			int i = Integer.parseInt(br.readLine());

			System.out.print("Enter Edge Vi : ");
			int j = Integer.parseInt(br.readLine());

			a[i][j] = 1;
			a[j][i] = 1;
		}
	}

	public void display() {
		System.out.println("\nAdjacency Matrix");
		for (int i = 0; i < nov; i++) {
			for (int j = 0; j < nov; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void bfs(int start) {
		System.out.print("\nBFS : ");
		enQueue(start);

		while (!isEmpty()) {
			int i = deQueue();

			if (visited[i] == 0) {
				System.out.print(i + " ");
				visited[i] = 1;
			}

			for (int j = 0; j < nov; j++) {
				if (a[i][j] == 1 && visited[j] == 0) {
					enQueue(j);
				}
			}
		}
		System.out.println();
	}

}
