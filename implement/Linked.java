package implement;

import linkedlist.NamesList;

public class Linked {

	public static void main(String[] args) {
		NamesList list = new NamesList("Yirsis");

		list.add("Paola");
		list.add("Raul");
		list.add("Jorge");
		list.add("Melisa");

		list.insert(3, "Fernanda");

		list.delete();

		list.print();
	}

}
