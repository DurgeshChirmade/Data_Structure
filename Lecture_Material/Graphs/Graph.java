package Graphs;

import java.util.Scanner;

public class Graph {

	private int arr[][];
	private int nofnodes;
	
	Scanner sc = new Scanner(System.in);
	
	public Graph()
	{
		System.out.println("Enter number of vertices:: ");
		nofnodes = sc.nextInt();
		
		arr = new int[nofnodes][nofnodes];
	}
	
	
	public void createGraph()
	{
		for(int i=0;i<nofnodes;i++)
		{
			System.out.println("\nEnter adjacency for "+(i+1)+" ::");
			for(int j=0;j<nofnodes;j++)
			{
				System.out.println("\t"+(i+1)+" ->"+(j+1)+" : ");
				int value = sc.nextInt();
				
				if(value==1 || value==0)
					arr[i][j] = value;
				else
					System.out.println("\n\tcant accept");
				//please handle the situation when adjcency is not 1 or 0
				//repeat for same vertex until user entered value is 1 or 0
			}
		}
	}//createGraph()
	
	
	public void adjacencyMatrix()
	{
		System.out.println("\nAdjacency Matrix:: ");
		for(int i=0;i<nofnodes;i++)
		{
			for(int j=0;j<nofnodes;j++)
			{
				System.out.print("   "+arr[i][j]);
			}
			System.out.println("");
		}
	}//adjMatrix()
	
	public void DFS()
	{
		int i, j, k = 0, visited[];

		//this array will hold the visited nodes
		visited = new int[nofnodes];		
		//initialize to 0 since it is array of counter
		for (i = 0;i < nofnodes;i++)
			visited[i] = 0;

		for (i = 0; i<nofnodes; i++)  
		{
			if(visited[i]==0)
			{
			     System.out.print("  "+(i+1));
			}
			visited[i] = 1;
			k=i;
			for (j = 0; j<nofnodes;)
			{
				if (arr[k][j] != 0) //check if adjacency exists
				{
					if (visited[j] == 0) //not visited
					{
						System.out.print("  "+(j+1));
						visited[j] = 1;
						k = j;
						j = 0;
					}
					else  j++;
				}
				else  j++;
			}//for_j
		}//for_i
		for (; i < nofnodes; i++)
			System.out.print("  "+(i+1));
	}//DFS

	
	public void BFS()
	{
		int i, j, k = 0, visited[];

		visited = new int[nofnodes];
		for (i = 0;i < nofnodes;i++)
			visited[i] = 0;

		System.out.print("1 ");
		for (i = 0;i<nofnodes;i++)
		{
			visited[i] = 1;

			for (j = 0;j<nofnodes;)
			{
				if (arr[i][j] != 0)  //or ==1
				{
					if (visited[j] == 0)  //not visited
					{
						System.out.print("   "+(j+1));
						visited[j] = 1;
					}
					else  j++;
				}
				else  j++;
			}//for_j
		}//for_i
	}//BFS

	
}//class




