package graphs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * This class reflects for the most part besides a few commented lines for BufferedWriter
 * the actual Solution class in HackerRank.
 * @author Owner
 *
 */
public class RoadsAndLibraries {
	
    // Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {

    	Long result = 0L;
    	GraphHR g = new GraphHR(n);
    	
    	result = g.roadsAndLibraries(n, c_lib, c_road, cities);
    	
    	return result;

    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String[] nmC_libC_road = scanner.nextLine().split(" ");

	            int n = Integer.parseInt(nmC_libC_road[0]);

	            int m = Integer.parseInt(nmC_libC_road[1]);

	            int c_lib = Integer.parseInt(nmC_libC_road[2]);

	            int c_road = Integer.parseInt(nmC_libC_road[3]);

	            int[][] cities = new int[m][2];

	            for (int i = 0; i < m; i++) {
	                String[] citiesRowItems = scanner.nextLine().split(" ");
	                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	                for (int j = 0; j < 2; j++) {
	                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
	                    cities[i][j] = citiesItem;
	                }
	            }

	            long result = roadsAndLibraries(n, c_lib, c_road, cities);

	            bufferedWriter.write(String.valueOf(result));
	            bufferedWriter.newLine();
	        }

	        bufferedWriter.close();

	        scanner.close();
	    }
	
}

class GraphHR {

	private int graphVertices;
	
	private LinkedList<Integer> adjacencies[];
	
	public GraphHR(int vertices)
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
	
	public static int dfsUtil(GraphHR g, int v, boolean visited[]) {
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
	
	private static long getCost(GraphHR g, long c_lib, long c_road)
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
		
		GraphHR g = new GraphHR(n);

		for(int i =0; i < cities.length; i++) {
			int city1 = cities[i][0];
			int city2 = cities[i][1];
			g.addBidirectionalEdge(city1 - 1 , city2 - 1);
		}
		
		result = getCost(g, c_lib, c_road);
		
		return result;
		
	}
	
}

