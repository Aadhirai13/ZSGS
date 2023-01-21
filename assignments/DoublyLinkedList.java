package assignments;

import assignments.SinglyLinkedList.Node;

public class DoublyLinkedList {

		Node head;
		Node tail;
		int size;
		
		class Node{
			Node prev;
			int data;
			Node next;
			
			Node(int val){
				prev = null;
				data = val;
				next = null;
				size++;
			}
		}
		
		DoublyLinkedList(){
			head = null;
			size = 0;
			tail = null;
		}
		
		public void insertAtPosition(int val,int pos) {
			Node newNode = new Node(val);
			if(head == null) {
				tail = newNode;
			}
			else {
				head.prev = newNode;
			}
			if(pos == 1) {
				newNode.next = head;
				head = newNode;
			}
			else {
				Node temp = head;
				for(int i=1;i<pos-1;i++) {
					temp= temp.next;
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
			newNode.prev = temp;
			temp.next = newNode;
		}
		
		public void removeAtPosition(int pos) {
			if(pos == 1) {
				Node curr = head.next;
				head.prev = curr.prev;
				head = curr;
				size--;
			}
			else {
				Node prev = head.next;
				Node curr = prev.next;
				for(int i=1;i<pos-2;i++) {
					prev = curr;
					curr.prev = curr.prev;
					curr = curr.next;
				}
				prev.prev = curr.prev;
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

