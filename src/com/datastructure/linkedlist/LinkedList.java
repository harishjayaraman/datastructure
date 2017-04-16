package com.datastructure.linkedlist;

public class LinkedList {

	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
		
	}
	
	public void deleteFromHead(){
		this.head = this.head.getNextNode();
	}
	
	
	public int length(){
		Node node = this.head;
		int length = 0;
		while(node != null){
			length++;
			node = node.getNextNode();
		}
		
		return length;
	}

	@Override
	public String toString() {
		String result = "{";
		Node current = this.head;
		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		return result += "}";
	}
}
