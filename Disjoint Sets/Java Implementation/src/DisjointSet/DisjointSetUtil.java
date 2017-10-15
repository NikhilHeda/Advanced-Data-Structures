package DisjointSet;

public class DisjointSetUtil {
	public Node[] all_nodes;

	public DisjointSetUtil(int n) {
		all_nodes = new Node[n];

		for (int i = 0; i < n; i++) {
			this.makeSet(i);
		}
	}

	// Make Set
	public void makeSet(int i) {
		DisjointSet ds = new DisjointSet();
		all_nodes[i] = new Node(i, ds);
		ds.insert(all_nodes[i]);
	}

	// Union
	public void union(int x, int y) {
		DisjointSet r1 = all_nodes[x].getBackpointer();
		DisjointSet r2 = all_nodes[y].getBackpointer();

		r1.tail.next = r2.head;

		Node temp = r2.head;
		while (temp != null) {
			temp.setBackpointer(r1);
			temp = temp.next;
		}

		r1.tail = r2.tail;

		r2.head = null;
		r2.tail = null;
	}

	// Find Set
	public DisjointSet findSet(int i) {
		return all_nodes[i].getBackpointer();
	}

}
