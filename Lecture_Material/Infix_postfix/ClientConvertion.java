package Infix_postfix;

import java.util.Scanner;

public class ClientConvertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String infix, postfix;
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("\nEnter infix expression::");
			infix = sc.next();
			
			Stack s = new Stack(infix.length());
			postfix = s.infix_postfix(infix);
			System.out.println("\n\tPostfix:: "+postfix);
			
			
			infix = sc.next();
		}while(!infix.equals("no"));
	
	}

}
