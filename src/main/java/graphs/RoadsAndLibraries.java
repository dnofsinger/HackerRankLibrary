package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class RoadsAndLibraries {
    
	
	
	/**
	 * 
	 * @param n Number of Cities
	 * @param c_lib Price of the Library
	 * @param c_road Price for the Road
	 * @param cities -- This doesn't make sense it should be roads...
	 * @return
	 */
	public static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {

		long result = 0L;
		
		GraphIC g = new GraphIC(n, false);

		for(int i =0; i < cities.length; i++) {
			int city1 = cities[i][0];
			int city2 = cities[i][1];
			g.addBidirectionalEdge(city1 - 1 , city2 - 1);
		}
		
		result = getCost(g, c_lib, c_road);
		
		return result;
		
	}
	
	private static long getCost(GraphIC g, long c_lib, long c_road)
	{
		Long cost= 0L;
		
		if(c_lib < c_road) {
			return c_lib * g.vertices;
		}
		
		boolean visited[]= new boolean[g.vertices];
		
		for(int i=0; i < g.vertices; i++)
		{
			if(!visited[i]) {
				int x = DFSUtil(g, visited, i);
				cost += (x-1)*c_road;
				cost += c_lib;
			}
		}
		
		return cost;
	}
	
	private static int DFSUtil(GraphIC g, boolean visited[], int current) {
		int count = 1;
		
		visited[current] = true;
		
		for(int a:g.adjacencies[current] ) {
			if(!visited[a]){
				count += DFSUtil(g, visited, a);
			}
		}
		
		return count;
	}
	
}


/*
 * Inner class for Graphs
 */
class GraphIC{
	int vertices;
	LinkedList<Integer> adjacencies[];
	private final boolean directed;
	
	GraphIC(int v, boolean directed){
		this.vertices = v;
		this.directed=directed;
		adjacencies = new LinkedList[v];
		for(int i=0; i < v; i++) {
			adjacencies[i] = new LinkedList<>();
		}
	}

	public void addBidirectionalEdge(int v, int w)
	{
		adjacencies[v].add(w);
		adjacencies[w].add(v);
	}
	
	public void insertEdge(int a, int b) {
		adjacencies[a].add(b);
		if(!directed) {
			adjacencies[b].add(a);
		}
	}
}
