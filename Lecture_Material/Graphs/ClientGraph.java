package Graphs;

import java.util.Scanner;

public class ClientGraph {

	public static void main(String []arg)
	{
	
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph();
		
		int option=0;
		
		do
		{
			System.out.println("***************Menu****************");
	    	 System.out.println("1:CreateGraph"
	    			 +"\n2:Adajency Matrix"
	    			 +"\n3: Degree"
	    			 +"\n4: DFS"
	    			 +"\n5: BFS"
	    			 +"\n0: Exit");
	    	 System.out.println("Enter choice::  ");
	    	 option = sc.nextInt();
	    	 
	    	 switch(option)
	    	 {
	    	 case 1:
	    		 g.createGraph();
	    		 break;
	    	 case 2:
	    		 System.out.println("**********Adajency Matrix****************\n");
	    		 g.adjacencyMatrix();
	    		 System.out.println("*******************************************");
	    		 break;
	    	/* case 3:
	    		 System.out.println("*********************Degree****************\n");
	    		 g.degree();
	    		 System.out.println("*********************************************");
	    		 break;
	    	*/ case 4:
	    		 System.out.println("********************DFS*************************");
	    		 g.DFS();
	    		 System.out.println("\n*********************************************");
	    		 break;
	    	 case 5:
	    		 System.out.println("*********************BFS************************");
	    		 g.BFS();
	    		 System.out.println("\n*********************************************");
	    		 break;
	    	 case 0: 
	    		 System.exit(0);
	    	 }//switch
	    	 			
		}while(option!=0);
		
		sc.close();
	}//main
	
}//class






