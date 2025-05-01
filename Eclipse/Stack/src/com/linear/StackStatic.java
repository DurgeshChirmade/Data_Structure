package com.linear;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StackStatic {

	private int size;
	private int[] stack;
	private int top;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public StackStatic() {
		this.size = 0;
		this.stack = new int[size];
		this.top = -1;
	}

	public void initStack() throws Exception {

		System.out.print("Enter size of stack : ");
		this.size = Integer.parseInt(br.readLine());

		this.stack = new int[size];
		this.top = -1;
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

	public void push(int value) {
		if (!isFull()) {
			stack[++top] = value;
		} else {
			System.out.println("\n Stack is overflow.....");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int value = stack[top--];
			return value;
		}
		System.out.println("\nStack is underflow.....");
		;
		return -1;
	}

	public void display() {

		if (!isEmpty()) {
			for (int i = top; i > -1; i--) {
				System.out.print("\n"+stack[i]);
			}
		}
		else {
			System.out.println("\n Stack is underflow...");
		}
	}

}
