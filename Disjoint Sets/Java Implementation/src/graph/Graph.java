package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import DisjointSet.DisjointSet;
import DisjointSet.DisjointSetUtil;

public class Graph {
	private int numVertices;
	private ArrayList<Edge> edges;

	public Graph(int n) {
		this.numVertices = n;
		this.edges = new ArrayList<>();
	}

	public void addEdge(Edge e) {
		this.edges.add(e);
	}

	public void kruskalsAlgorithm() {
		// Creating a Edges list
		ArrayList<Edge> minSpanTree = new ArrayList<Edge>();

		// Creating Disjoint Set
		DisjointSetUtil ds = new DisjointSetUtil(this.numVertices);

		// Sort Edges
		Collections.sort(edges, new Comparator<Edge>() {
			@Override
			public int compare(Edge e1, Edge e2) {
				return e1.weight - e2.weight;
			}
		});

		Iterator<Edge> i = this.edges.iterator();

		while (i.hasNext()) {
			Edge current = i.next();
			// System.out.println(current);
			DisjointSet r1 = ds.findSet(current.vertex1);
			DisjointSet r2 = ds.findSet(current.vertex2);

			if (r1.head.data != r2.head.data) {
				ds.union(current.vertex1, current.vertex2);
				minSpanTree.add(current);
			}

		}

		i = minSpanTree.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
