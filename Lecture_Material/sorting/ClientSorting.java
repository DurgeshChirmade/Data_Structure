package sorting;

import java.util.Scanner;

public class ClientSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0,option;
		Scanner sc = new Scanner(System.in);
		Sorting s = new Sorting(0);
		
		do {
			System.out.println("\n--------------------------------");
			System.out.println("\n1: Sorting\n0:Exit");
			option = sc.nextInt();
			
			if(option==0)
				System.exit(0);
			else
			{
				System.out.println("\n-----------------Menu------------");
				System.out.println("1:Bubble Sort"+
				                   "\n2:Selection Sort"+
						           "\n3:Insertion Sort"+
				                   "\n4:Quick Sort"+
						           "\n5:Merge Sort"+
				                   "\n0:EXIT");
				System.out.println("Enter your choice:: ");
				option = sc.nextInt();
				
				if(option!=5)
				{
					System.out.println("Enter size of the array:: ");
					size = sc.nextInt();
			        s.setArray(size);
			        s.accept();
				    System.out.println("Before sorting::\n");
				    s.display();
				}
				switch(option)
				{
				case 1:					       
				       s.bubble_sort();
				       System.out.println("\nAfter sorting::\n");
				       s.display();
				       break;
				case 2:      
				    s.selectionSort();
				    System.out.println("\nAfter sorting::\n");
				    s.display();
				    break;
				case 3:
					s.insertionSort();
					System.out.println("\nAfter sorting::\n");
				    s.display();
				    break;
				case 4:
					s.quickSort(0,size-1);  //lower_bound,upper_bound
					System.out.println("\nAfter sorting::\n");
				    s.display();
				    break;
				case 5:
					s.merge_sort();
					break;
				case 0:
					System.exit(0);
				}//switch	
				
			}//else
		}while(option!=0);
			
		       
       sc.close();
	}//main

}
