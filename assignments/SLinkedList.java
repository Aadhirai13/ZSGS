package assignments;

public class SLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtPosition(2,1);
		list.insertAtPosition(5,1);
		list.insertAtPosition(3,2);
		list.insertAtPosition(6,2);
		list.insertAtPosition(7,3);
		list.insertAtPosition(6,6);
		list.insertAtEnd(6);
		list.removeAtEnd();
		list.removeAtPosition(1);
		list.removeAtPosition(3);
		list.display();
	}

}
