package com.datastructure.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtHead(5);
		linkedList.insertAtHead(6);
		linkedList.insertAtHead(7);
		linkedList.insertAtHead(8);
		linkedList.insertAtHead(9);
		linkedList.insertAtHead(10);
		
		System.out.println(linkedList);
		System.out.println(linkedList.length());
		
		
	}
	
	
}
