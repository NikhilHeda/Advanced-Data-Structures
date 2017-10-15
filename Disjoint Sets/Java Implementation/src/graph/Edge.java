package graph;

public class Edge {
	public int weight;
	public int vertex1;
	public int vertex2;
	
	public Edge(int v1, int v2, int w){
		this.vertex1 = v1;
		this.vertex2 = v2;
		this.weight = w;
	}
	
	@Override
	public String toString() {
		return "(" + this.vertex1 + ", " + this.vertex2 + ") -> " + this.weight;
	}

}
