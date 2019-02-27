package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int graphVertices;
	
	private LinkedList<Integer> adjacencies[];
	
	Graph(int vertices)
	{
		graphVertices = vertices;
		adjacencies = new LinkedList[vertices];
		for(int i=0; i < vertices; ++i) 
		{
			adjacencies[i] = new LinkedList();
		}
		
	}
	
	void addEdge(int v, int w) 
	{
		adjacencies[v].add(w);
	}
	
	void dfsUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.println(v + " ");
		
		Iterator<Integer> i = adjacencies[v].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
				dfsUtil(n, visited);
		}
		
	}
	
	void DFS(int v)
	{
		boolean visited[] = new boolean[graphVertices];
		
		dfsUtil(v, visited);
	}
	
}
