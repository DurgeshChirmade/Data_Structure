package c2stack;

public class C2StackChar {

	private int size;
	private char[] stk;
	private int top1;
	private int top2;

	public C2StackChar() {
		this.size = 0;
		stk = new char[size];
		top1 = -1;
		top2 = size;
	}

	public void initStack(int size) {
		this.size = size;
		top1 = -1;
		top2 = size;
		stk = new char[size];
	}

	public boolean isFull() {
		if (top2 == top1 + 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top1 == -1 && top2 == size) {
			return true;

		} else {
			return false;
		}
	}

	public void push1(char value) {
		if (!isFull()) {
			stk[++top1] = value;
		} else {
			System.out.println("\nSTACK OVERFLOW...\n");
		}
	}

	public void push2(char value) {
		if (!isFull()) {
			stk[--top2] = value;
		} else {
			System.out.println("\nSTACK OVERFLOW...\n");
		}
	}

	public char pop1() {
		if (!isEmpty()) {
			return stk[top1--];
		} else {
			System.out.println("\nSTACK UNDERFLOW...\n");
		}
		return '\0';
	}

	public char pop2() {
		if (!isEmpty()) {
			if (top2 != size)
				return stk[top2++];
			else
				System.out.println("\nSTACK 2 is empty\n");
		} else {
			System.out.println("\nSTACK UNDERFLOW...\n");
		}
		return '\0';
	}

	public void display1() {
		if (!isEmpty()) {
			for (int i = top1; i > -1; i--) {
				System.out.println(stk[i]);
			}
		} else {
			System.out.println("\nSTACK UNDERFLOW....\n");
		}
	}

	public void display2() {
		if (!isEmpty()) {
			if (top2 != size) {
				for (int i = top2; i <= size - 1; i++) {
					System.out.println(stk[i]);
				}
			}
			if (top2 == size) {
				top2 = top1;
				for (int i = top2; i > -1; i--) {
					System.out.println(stk[i]);
				}
			}

		} else {
			System.out.println("\nSTACK UNDERFLOW...\n");
		}
	}
}

