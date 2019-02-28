package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	private int graphVertices;
	
	private LinkedList<Integer> adjacencies[];
	
	public Graph(int vertices)
	{
		graphVertices = vertices;
		adjacencies = new LinkedList[vertices];
		for(int i=0; i < vertices; ++i) 
		{
			adjacencies[i] = new LinkedList<>();
		}
		
	}
	
	public void addEdge(int v, int w) 
	{
		adjacencies[v].add(w);
	}
	
	public void addBidirectionalEdge(int v, int w)
	{
		adjacencies[v].add(w);
		adjacencies[w].add(v);
	}
	
	public static int dfsUtil(Graph g, int v, boolean visited[]) {
		int count = 1;
		visited[v] = true;
		
		Iterator<Integer> i = g.adjacencies[v].listIterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
				count += dfsUtil(g, n, visited);
		}
		return count;
	}
	
	private static long getCost(Graph g, long c_lib, long c_road)
	{
		Long cost= 0L;
		
		if(c_lib < c_road) {
			return c_lib * g.graphVertices;
		}
		
		boolean visited[]= new boolean[g.graphVertices];
		
		for(int i=0; i < g.graphVertices; i++)
		{
			if(!visited[i]) {
				int x = dfsUtil(g, i, visited );
				cost += (x-1)*c_road;
				cost += c_lib;
			}
		}
		
		return cost;
	}
	
	public static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {

		long result = 0L;
		
		Graph g = new Graph(n);

		for(int i =0; i < cities.length; i++) {
			int city1 = cities[i][0];
			int city2 = cities[i][1];
			g.addBidirectionalEdge(city1 - 1 , city2 - 1);
		}
		
		result = getCost(g, c_lib, c_road);
		
		return result;
		
	}
	
}
