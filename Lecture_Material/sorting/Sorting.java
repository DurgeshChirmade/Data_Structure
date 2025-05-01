package sorting;

import java.util.Scanner;

public class Sorting {

	private int arr[];
	private int size;
	Scanner sc =new Scanner(System.in);
	
	public Sorting(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public void setArray(int size) {
		this.size = size;
		arr = new int[this.size];
	}
	
	public void accept() {
		System.out.println("Enter random values:: ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();		    
	}
	
	public void display() {
		for(int i=0;i<arr.length;i++)
		    System.out.print("\t"+arr[i]);
	}
	
	public void bubble_sort()
	{
	    int i,j,temp;
	    for(i=0;i<size-1;i++)//passes
	    {
	    	for(j=0;j<size-1-i;j++)
	    	{
	    		if(arr[j]>arr[j+1])
	    		{
	    			temp = arr[j];
	    			arr[j] = arr[j+1];
	    			arr[j+1] = temp;
	    		}
	    	}
	    }
	}
	
	public void selectionSort()
	{
		int i,j,small;
		
		for(i=0;i<size-1;i++)//passes
		{
			small = i;
			for(j=i+1;j<size;j++)  //comparisons
			{
				if(arr[j]<arr[small])
				{ 
					small = j;   //replace the position in small
				}
			}
			if(i!=small)
			{
				int temp = arr[i];
				arr[i] = arr[small];
				arr[small] = temp;
			}
		}//outer_for		
	}//selection
		
	public void insertionSort()
	{
		int i,j,small;
		
		for(i=1;i<size;i++)  //i starts from 2nd position
		{
			small = arr[i];
			for(j=i-1;j>-1 && arr[j]>small ;j--)//comparisons
			{
				arr[j+1] = arr[j];
			}
			arr[j+1] = small;
		}
	}//insertion
	
	//functions to sort using Quick Sort algorithm::
	public int split(int low, int high)
	{
		int pivot = arr[low];
		int temp;		
		int i = low;
		int j = high;

		do
		{
			while(arr[i]<pivot && i< high)
				i++;
	        while(pivot < arr[j])
				j--;

			if (i<j)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		} while (i<j);

		return j;
	}

	public void quickSort(int low, int high)
	{
		int pivot;
		if (low < high)
		{
			pivot = split(low, high);
			quickSort(low, pivot - 1);  //LHS list 
			quickSort(pivot + 1, high); //RHS list
		}
	}//quick()
	
	public void merge_sort()
	{
		int size1,size2;
		
		System.out.println("Enter size for array1:: ");
		size1 = sc.nextInt();
		System.out.println("Enter size for array2:: ");
		size2 = sc.nextInt();
		
		int arr1[]= new int[size1];
		int arr2[]= new int[size2];
		int arr3[]= new int[size1+size2];
		
		//accept values for both arrays::
		System.out.println("Enter sorted values for arr1:: ");
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextInt();
		System.out.println("Enter sorted values for arr2:: ");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=sc.nextInt();		
		
		//merging::
		int i=0,j=0,k=0;  //iterators for arr1,arr2,arr3 resp.
		while(i<size1 && j<size2)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k] = arr1[i];  //copying value from arr1
				i++;
				k++;
			}
			else if(arr1[i]>arr2[j])
			{
				arr3[k] = arr2[j];  //copying value from arr2
				j++;
				k++;
			}
			else //arr1[i]==arr2[j]
			{
				arr3[k] = arr1[i];
				i++;
				k++;
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}//while
		
		//check arr1 or arr2 has reach out of bounds
		if(i!=size1)  //arr1 has not reached to last index
		{
			for(;i<size1;i++,k++)
				arr3[k] = arr1[i];
		}
		else if(j!=size2)  //arr2 has not reached to last index
		{
			for(;j<size2;j++,k++)
				arr3[k] = arr2[j];
		}	
		
		System.out.println("\n-----------Array3 after Merging::--------------\n");
		for(i=0;i<arr3.length;i++)
		    System.out.print("\t"+arr3[i]);
		
	}//merge
	
}//class











