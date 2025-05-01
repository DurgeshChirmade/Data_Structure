package Tree;

import java.util.Scanner;

public class ClientBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		
		Scanner sc = new Scanner(System.in);
		int value;
		int option=0;
		
		do
		{
			System.out.println("\n\t---------Menu---------");
			System.out.println("1:Add"+
			                   "\n3:Pre-order"+
					           "\n4:In-order"+
			                   "\n5:Post-order"+
			                   "\n0:EXIT");
			System.out.println("Enter your choice:: ");
			option = sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("\nEnter value to add: ");
				value = sc.nextInt();
				bst.addNode(value);
				break;
			case 3:
				System.out.println("\t----------Pre-Order-----------");
				bst.preOrder(bst.getRoot());
				System.out.println("\n-----------------------------");
				break;
			case 4:
				System.out.println("\t----------Pre-Order-----------");
				bst.inOrder(bst.getRoot());
				System.out.println("\n-----------------------------");
				break;
			case 5:
				System.out.println("\t----------Pre-Order-----------");
				bst.postOrder(bst.getRoot());
				System.out.println("\n-----------------------------");
				break;
			case 0:
				System.exit(0);
			
			}//switch
			
			
		}while(option!=0);

	}//main

}//class









