package com.linear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueueStatic {

	private int size;
	private int[] que;
	private int front;
	private int rear;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public QueueStatic() {
		size = 0;
		que = new int[size];
		front = rear = -1;
	}

	public void initQueue() throws Exception {
		System.out.print("Enter the size of queue : ");
		size = Integer.parseInt(br.readLine());

		this.que = new int[size];
		front = rear = -1;
	}

	public boolean isFull() {
		if (rear == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		}
		return false;
	}

	public void enQueue(int value) {
		if (!isFull()) {
			que[++rear] = value;
		} else {
			System.out.println("Queue is full already.");
		}
	}

	public int deQueue() {
		if (!isEmpty()) {
			return que[++front];
		} else {
			System.out.println("Queue is empty already.");
		}
		return -1;
	}
	
	public void display() {
		
		if(!isEmpty()) {
			for(int i=front+1;i<=rear;i++) {
				System.out.print("\n"+que[i]);
			}
		}
		else {
			System.out.println("Queue is empty already.");
		}
	}
}
