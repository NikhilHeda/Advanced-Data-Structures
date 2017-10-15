import graph.Edge;
import graph.Graph;

//import DisjointSet.DisjointSetUtil;

public class Client {
	public static void main(String[] args) {
		/*
		int n = 10;
		DisjointSetUtil sets = new DisjointSetUtil(n);

		for (int i = 0; i < n; i++)
			System.out.println(sets.findSet(i));

		// union of 0 and 3;
		sets.union(0, 3);
		sets.union(2, 4);

		System.out.println("--------");

		// Print all reprs
		for (int i = 0; i < n; i++)
			System.out.println(sets.findSet(i));
		 */

		int n = 9;
		Graph g = new Graph(n);
		
		g.addEdge(new Edge(0, 1, 4));
		g.addEdge(new Edge(0, 7, 8));
		g.addEdge(new Edge(1, 7, 11));
		g.addEdge(new Edge(2, 1, 8));
		g.addEdge(new Edge(2, 8, 2));
		g.addEdge(new Edge(7, 8, 7));
		g.addEdge(new Edge(7, 6, 1));
		g.addEdge(new Edge(8, 6, 6));
		g.addEdge(new Edge(2, 5, 4));
		g.addEdge(new Edge(2, 3, 7));
		g.addEdge(new Edge(6, 5, 2));
		g.addEdge(new Edge(3, 5, 14));
		g.addEdge(new Edge(3, 4, 9));
		g.addEdge(new Edge(5, 4, 10));
		
		/*
		int n = 6;
		Graph g = new Graph(n);
		
		g.addEdge(new Edge(0, 1, 3));
		g.addEdge(new Edge(0, 5, 5));
		g.addEdge(new Edge(0, 4, 6));
		g.addEdge(new Edge(1, 2, 1));
		g.addEdge(new Edge(1, 5, 4));		
		g.addEdge(new Edge(2, 5, 4));
		g.addEdge(new Edge(2, 3, 6));
		g.addEdge(new Edge(3, 5, 5));
		g.addEdge(new Edge(3, 4, 8));
		g.addEdge(new Edge(4, 5, 2));
		*/
		
		g.kruskalsAlgorithm();

	}
}