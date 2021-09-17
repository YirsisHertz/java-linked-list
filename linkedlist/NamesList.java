package linkedlist;

public class NamesList {
	private Node head;
	private Node tail;

	public NamesList(String value) {
		head = new Node(null, null);
		tail = new Node(value, null);

		head.setLink(tail);
	}

	public void print() {
		Node pointer = this.head;

		while (pointer != null) {
			String value = pointer.getValue();

			System.out.print(value + " -> ");

			pointer = pointer.getLink();
		}

		System.out.print("null");
	}

	public void add(String value) {
		Node node = new Node(value, null);
		tail.setLink(node);
		tail = node;
	}

	public void insert(int position, String value) {
		Node newNode = new Node(value, null);

		Node pointer = head;
		int positionActual = 0;

		while (pointer.getLink() != null && positionActual < position - 1) {
			pointer = pointer.getLink();
			positionActual++;
		}

		newNode.setLink(pointer.getLink());
		pointer.setLink(newNode);
	}

	public void delete() {
		Node pointer = head;

		Node temporal = pointer.getLink();
		pointer.setLink(pointer.getLink().getLink());
		temporal.setLink(null);
	}

	public void delete(int position) {
		Node pointer = head;
		int positionActual = 0;

		while (pointer.getLink() != null && positionActual < position - 1) {
			pointer = pointer.getLink();
			positionActual++;
		}

		Node temporal = pointer.getLink();
		pointer.setLink(pointer.getLink().getLink());
		temporal.setLink(null);
	}

}
