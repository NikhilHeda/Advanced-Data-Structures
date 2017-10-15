package DisjointSet;

public class DisjointSet {
	public Node head;
	public Node tail;

	public DisjointSet() {
		this.head = null;
		this.tail = null;
	}

	// Linked List insert function
	public void insert(Node n) {
		if (this.head == null) {
			this.head = n;
			this.tail = n;
		} else {
			Node temp = this.head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = n;
		}
	}

	// Display
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println("BackPointer: " + temp.getBackpointer() + "\tData:");
		}
	}

	// toString
	@Override
	public String toString() {
		return Integer.toString(this.head.data);
	}

}