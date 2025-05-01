package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	private int size;
	private int arr[];
	
	static Scanner sc = new Scanner(System.in);
	public BinarySearch()
	{
		System.out.println("\nEnter size:: ");
		size = sc.nextInt();
		arr = new int[size];
	}
	public void accept()
	{
		System.out.println("Enter sorted elements:: ");
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
	}
	public void display()
	{
		System.out.println("Elements::");
		System.out.print(Arrays.toString(arr));
	}
	public void Search(int key)
	{
		int mid=-1,flag=0;
		int i=0,j=size;
		while(i!=j)
		{
			mid = (i+j)/2;
			if(key == arr[mid])
			{
				flag=1;
				break;
			}
			else if(key < arr[mid])  //LHS
			{
				//i = 0;
				j=mid;
				continue;
			}
			else if(key > arr[mid])  //RHS
			{
				i=mid+1;
				//j=size;
				continue;
			}
		}//while
		if(flag==0)
			System.out.println("\tElement NOT FOUND...........");
		else
			System.out.println("\tElement found at index "+mid);
	}//search
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
       BinarySearch obj = new BinarySearch();
       obj.accept();
       obj.display();
       
       do{
    	   System.out.println("\n1: Search \n0:exit");
    	   ch = sc.nextInt();
    	   if(ch==1)
    	   {
    		   obj.display();
		       System.out.println("\nEnter key to search:: ");
		       int key = sc.nextInt();
		       obj.Search(key);
    	   }
    	   else
    		   System.exit(0);
       }while(ch!=0);
	}


}
