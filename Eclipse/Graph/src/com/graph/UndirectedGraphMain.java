package com.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UndirectedGraphMain {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		UndirectedGraph ug = new UndirectedGraph();

		ug.accept();
		ug.display();

		System.out.print("Enter Starting Vertex : ");
		int start = Integer.parseInt(br.readLine());

		ug.dfs(start);

	}

}
