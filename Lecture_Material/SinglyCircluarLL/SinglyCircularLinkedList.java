package SinglyCircluarLL;

import java.util.Scanner;

public class SinglyCircularLinkedList {
	
	private Node head;
	Scanner sc = new Scanner(System.in);
	
	public SinglyCircularLinkedList()
	{
		head = null;
	}
	
	public Node createNode()
	{
		Node newnode = new Node();
		
		System.out.println("\nEnter data:: ");
		newnode.setData(sc.nextInt());
		
		newnode.setNext(newnode);
		return newnode;
	}

	public void addAtStart()
	{
		Node newnode = createNode();
		
		if(head==null)
			head = newnode;
		else
		{
			newnode.setNext(head);
			//traverse to find last node
			Node temp =head;
			while(temp.getNext()!=head)
				temp = temp.getNext();
			
			temp.setNext(newnode);
			head = newnode;			
		}
	}
	
	public void addAtEnd()
	{
		Node newnode = createNode();
		if(head == null)
			head = newnode;
		else
		{
			newnode.setNext(head);
		    //traverse to get last node
			Node temp=head;
			while(temp.getNext()!=head)
				temp = temp.getNext();
			temp.setNext(newnode);
		}
		
	}
	
	public void deleteAtStart()
	{
		Node temp = head;
		
		if(head==null)
			System.out.println("\n\tLinked list is empty...!!");
		else
		{
			//traverse to find last node
			while(temp.getNext()!=head)
				temp = temp.getNext();
			//connect last node with 2nd node
			temp.setNext(head.getNext());
			//dlink head with 2nd node
			head.setNext(null);
			//shift head to 2nd node
			head = temp.getNext();
		}
	}
	
	public void deleteAtEnd()
	{
		Node temp =head;
		if(head == null)
			System.out.println("\n\tLinked list is empty...!!");
		else
		{
			//traverse to find 2nd last node
			while(temp.getNext().getNext()!=head)
				temp = temp.getNext();
			
			//dlink last node from head
			temp.getNext().setNext(null);
			//connect 2nd last node with head
			temp.setNext(head);
		}
	}
	
	public void display()
	{
		Node temp =head;
		if(head == null)
			System.out.println("\n\tLinked list is empty...!!");
		else
		{
			/*
			while(temp.getNext()!=head)
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.print(temp.getData());
			*/
			//OR
			do
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}while(temp!=head);
		}
		
	}//display
	
}//class










