.package StackArray;

import java.util.Scanner;

public class StackArray {
	
	private int size;
	private int stk[];
	private int top;
	
	Scanner sc = new Scanner(System.in);
	
	public StackArray()
	{
		size = 0;
		stk =new int[size];
		top = -1;
	}
	
	//method to create new stack
	public void initStack()
	{
		System.out.println("\nEnter size for stack:: ");
		size = sc.nextInt();
		stk  = new int[this.size];
		this.top = -1;
	}
	
	public boolean isFull()
	{
		if(top == size-1)
			return true;
		else 
			 return false;
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void push(int value)
	{
		if(!isFull())
		{
			top++;
			stk[top] = value;
			//OR
			//stk[++top] = value;
		}
		else
			System.out.println("\n\tSTACK OVERFLOW......");
	}
	
	public int pop()
	{
		int value=-1;
		if(!isEmpty())
		{
			value = stk[top];
			top--;
			//OR
			//return stk[top--];
		}
		else
			System.out.println("\n\tSTACK UNDERFLOW....");
		
	  return value;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			for(int i=top; i>-1 ; i--)
				System.out.print("\n\t"+stk[i]);
		}
		else
			System.out.println("\n\tSTACK UNDERFLOW....");
	}
}//class_stack







