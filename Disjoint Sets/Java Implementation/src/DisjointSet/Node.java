package DisjointSet;

public class Node {
	public int data;
	public Node next;
	private DisjointSet backpointer;

	public Node(int data, DisjointSet backpointer) {
		this.data = data;
		this.next = null;
		this.backpointer = backpointer;
	}

	public void setBackpointer(DisjointSet newBackpointer) {
		this.backpointer = newBackpointer;
	}

	public DisjointSet getBackpointer() {
		return this.backpointer;
	}

}