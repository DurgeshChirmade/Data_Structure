package SinglyLL;

import java.util.Scanner;

public class SinglyLinkedList {

	private Node head;
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	public void setHead(Node newnode)
	{
		head = newnode;
	}
	
	//method to create newnode
	public Node createNewnode()
	{
		//Step1:  allocate memory for newnode at runtime
		Node newnode = new Node();
		//Step 2: set Data
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter data:: ");
		newnode.setData(sc.nextInt());
		//Step3:: set Next to null
		newnode.setNext(null);
				
		return newnode;
	}//createNode
	
	
	public void addAtStart()
	{
		Node newnode = createNewnode();
		
		if(head == null)
		{
			head = newnode;
		}
		else
		{
		    newnode.setNext(head); //connect newnode with head	
		    head = newnode; //shift head to newnode
		}		
			
	}//addStart
	
	public void addAtEnd()
	{
		Node newnode = createNewnode();
		Node temp=null;
		
		if(head == null)
			head = newnode;
		else
		{
			temp = head;
			while(temp.getNext()!=null)  //traverse and find out the last node
			{
				temp = temp.getNext();
			}
			//connect newnode to last node i.e. temp
			temp.setNext(newnode);
		}
		
	}//addEnd
	
	public void addAtMid(int value)
	{
		Node newnode = createNewnode();
		Node temp=null;
		
		//case 1 LL is empty
		if(head == null)
		{
			head = newnode;
		}
		//case 2:: Only one node exists
		else if(head.getNext() == null)
		{
			//case 2.1: node with value exists
			if(head.getData() == value)
			     head.setNext(newnode);
			//case 2.2:
			else 
				System.out.println("\tError::Node not exists....!!!!");
		}
		else  //case 3:: LL contains multiple node
		{
			temp = head;
			//search for valid node until end of LL
			while(temp!=null && temp.getData() != value)
			{
				temp = temp.getNext();
			}
			//check if temp contains address of valid node
			if(temp!=null)
			{
				//step a: connect newnode with temp's adjacent node
				newnode.setNext(temp.getNext());
				//step b: connect temp and newnode
				temp.setNext(newnode);				
			}
			else
			{
				System.out.println("\tError::Node not exists....!!!!");
			}
			
		}//else
				
	}//addMid
	
	public void deleteAtStart()
	{
		Node temp = head;
		
		if(head==null)
			System.out.println("\n\tLinked list is empty...!!");
		else
		{
			head = head.getNext();
			temp.setNext(null);
			//release temp
		}
	}
	
	public void deleteAtEnd()
	{
		Node temp = head;
		
		if(head == null)
			System.out.println("\n\tLinked List is empty...!!");
		else if(head.getNext()==null)//LL existing with single node
		{
           head = null;		
           //release temp
		}
		else  //LL with multiple nodes
		{
			//traverse to search 2nd-last node
			while(temp.getNext().getNext()!=null)
				temp = temp.getNext();
			
			//d-link 2nd-lst node with last node
			temp.setNext(null);
			//release temp
		}
		
	}//deleteEnd
	
	public void deleteAtMid(int value)
	{
		Node temp=head;
		
		if(head == null)
		{
			System.out.println("\n\tLinked List is empty....!!!\n");
		}
		else if(head.getNext()==null)//LL with single node
		{
			if(head.getData()==value)
			{
				head = null;
				//release temp
			}
			else
				System.out.println("\n\tNode not found...!!!");
		}
		else
		{
			Node tag = head;
			//traverse to find node with value
			while(temp!=null && temp.getData()!=value)
			{
				tag = temp;  //tag points to preceding node
				temp = temp.getNext();
			}
			if(temp!=null) //node found
			{
				tag.setNext(temp.getNext());  //connect tag with temp's adjacent node
				temp.setNext(null); //dlink temp with its adjacent node
				//release temp
			}
			else
				System.out.println("\n\tNode not found...!!!");
		}
		
	}//deleteMid
	
	public void reverse()
	{
		Node prev=head;
		Node curr=null;
		Node next=null;
		
		if(prev!=null)
			curr  = head.getNext();
		if(curr!=null || curr.getNext()!=null)
			next = curr.getNext();
		
		while(curr!=null)
		{
			curr.setNext(prev);  //reversing curr and prev
			prev= curr;
			curr = next;
			if(next!=null)   //check if next is pointing to node
			    next = next.getNext();
		}//end_while
		
		//existing head should store null in its next
		head.setNext(null);
		head = prev; //shift head to last node
		
	}//reverse
	
	public void display()
	{
		Node temp = head;
		
		if(head == null)
		{
			System.out.println("\n\tLinked List is empty....!!!\n");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(" "+temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.print("NULL");
		}//else
		
	}//display()
	
}//class













