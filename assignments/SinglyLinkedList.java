package assignments;



public class SinglyLinkedList {
	Node head;
	int size;
	
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
			size++;
		}
	}
	
	SinglyLinkedList(){
		head = null;
		size = 0;
	}
	
	public void insertAtPosition(int val,int pos) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		else if(pos == 1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			for(int i=1;i<pos-1;i++) {
				temp = temp.next;
				if(temp == null) {
					System.out.println( pos + " is invalid position");
					return;
					
				}
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public void insertAtEnd(int val) {
		Node newNode = new Node(val);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		newNode.next = null;
		temp.next = newNode;
	}
	
	public void removeAtPosition(int pos) {
		if(pos == 1) {
			Node curr = head.next;
			head = curr;
			size--;
		}
		else {
			Node prev = head.next;
			Node curr = prev.next;
			for(int i=1;i<pos-2;i++) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = curr.next;
			size--;
		}
	}
	
	public void removeAtEnd() {
		Node temp = head;
		for(int i=1;i<size-1;i++) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
