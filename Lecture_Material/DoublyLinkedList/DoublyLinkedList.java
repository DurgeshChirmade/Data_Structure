package DoublyLL;

import java.util.Scanner;

public class DoublyLinkedList {

	private Node head;
	Scanner sc = new Scanner(System.in);
	
	public DoublyLinkedList()
	{
		head = null;
	}
	
	public Node createNode()
	{
		Node newnode = new Node();
		newnode.setNext(null);
		newnode.setPrev(null);
		
		System.out.println("\nEnter data::");
		newnode.setData(sc.nextInt());
		
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
			head.setPrev(newnode);
			head = newnode;
		}//else
		
	}//addstart()
	
	public void addAtEnd()
	{
		Node newnode = createNode();
		Node temp=head;
		
		if(head==null)
			head = newnode;
		else
		{
			//traverse and search last node
			while(temp.getNext()!=null)
				temp = temp.getNext();
			
			temp.setNext(newnode);
			newnode.setPrev(temp);
		}//else
	}//addEnd
	
	public void addAtMid(int value)
	{
		Node newnode = createNode();
		Node temp=head;
		
		if(head == null)
			head = newnode;
		else if(head.getNext()==null) //LL with single node
		{
			if(head.getData()==value)
			{
				head.setNext(newnode);
				newnode.setPrev(head);
			}
			else
				System.out.println("\n\tNode not found...");
		}
		else //LL with multiple nodes
		{
			while(temp!=null && temp.getData()!=value)
				temp = temp.getNext();
			
			if(temp!=null)//Node is found
			{
				//connect newnode with temp's adjacent node
				newnode.setNext(temp.getNext());
				//temp's adjacent node with newnode
				temp.getNext().setPrev(newnode);
				
				//connect temp and newnode
				temp.setNext(newnode);
				newnode.setPrev(temp);
			}
			else
				System.out.println("\n\tNode not found");
		}
		
	}//addMid
	
	public void deleteAtStart()
	{
		if(head==null)
			System.out.println("\n\tLinked list is empty");
		else
		{
			head = head.getNext();
			if(head!=null) //LL with mutiple nodes
				head.setPrev(null);
		}
		
	}//deleteStart
	
	public void deleteAtEnd()
	{
		 if(head == null)
			 System.out.println("\n\tLinked List is Empty.....");
		 else if(head.getNext()==null)
			 head = null;
		 else
		 {
			 Node temp = head;
			 //traverse to search 2nd last node
			 while(temp.getNext().getNext()!=null)
				 temp = temp.getNext();
			 
			 //dlink last node's prev 
			 temp.getNext().setPrev(null);
			 //dlink temp with last node
			 temp.setNext(null);
		 }
		
	}//deleteEnd
	
	public void deleteAtMid(int value)
	{
		Node temp=head;
		
		if(head == null)
			System.out.println("\n\tLinked List is Empty.....");
		else if(head.getNext()==null) //LL with single node
		{
			if(head.getData()==value)
			{
				head = null;
			}
			else
				System.out.println("\n\tNode not found...");
		}
		else //LL with multiple nodes
		{
		   while(temp!=null && temp.getData()!=value)
			   temp = temp.getNext();
		   
		   if(temp!=null)
		   {
			   temp.getNext().setPrev(temp.getPrev());
			   temp.getPrev().setNext(temp.getNext());
			   
			   //dlink temp:
			   temp.setNext(null);
			   temp.setPrev(null);
		   }
		   else
			   System.out.println("\n\tNode not found...");
		}
	}//deleteMid
	
	public void display()
	{
		Node temp = head;
		
		if(head == null)
			System.out.println("\n\tLinked List is Empty.....");
		else
		{
			System.out.print("NULL->");
			while(temp!=null)
			{
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.print("NULL");
		}
		
	}//display
	
}//class



















