package C2Stack;

public class C2StackArray {

	private int size;
	private int []stk;
	private int top1;
	private int top2;
	
	public C2StackArray()
	{
		size = 0;
		stk = new int[size];
		top1 = -1;
		top2 = size;
	}
	
	public void initStack(int size)
	{
		this.size = size;
		top1=-1;
		top2 = size;
		stk = new int[size];
	}
	
	public boolean isFull()
	{
		if(top2 == top1+1 )
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(top1 == -1 && top2 == size)
			return true;
		else
			return false;
	}
	
	public void push1(int value)
	{
		if(!isFull())
		{
			top1++;
			stk[top1] = value;
		}
		else
			System.out.println("\n\tSTACK OVERFLOW");
	} 
	
	public void push2(int value)
	{
		if(!isFull())
		{
			top2--;
			stk[top2] = value;
		}
		else
			System.out.println("\n\tSTACK OVERFLOW");
	}
	
	public int pop1()
	{
		int value=-1;
		
		if(!isEmpty())
		{
			value = stk[top1];
			top1--;			
		}
		else
			System.out.println("\n\tSTACK UNDERFLOW");
		
		return value;
	}
	
	public int pop2()
	{
		int value=-1;
		
		if(!isEmpty())
		{
			value = stk[top2];
			top2++;
		}
		else
			System.out.println("\n\tSTACK UNDERFLOW");
		
		return value;
	}
	
	public void display1()
	{
		if(!isEmpty())
		{
			int i;
			for(i=top1;i>-1;i--)
				System.out.println("\t"+stk[i]);
		}
		else
			System.out.println("\n\tSTACK UNDERFLOW");
	}
	
	public void display2()
	{
		if(!isEmpty())
		{
			int i;
			for(i=top2;i<size;i++)
				System.out.println("\t"+stk[i]);
		}
		else
			System.out.println("\n\tSTACK UNDERFLOW");
	}
}//class












