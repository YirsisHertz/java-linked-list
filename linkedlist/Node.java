package linkedlist;

public class Node {
	private String value;
	private Node link;

	public Node(String value) {
		this.value = value;
		this.link = null;
	}

	public Node(String value, Node link) {
		this.value = value;
		this.link = link;
	}

	public String getValue() {
		return value;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node newLink) {
		link = newLink;
	}

}