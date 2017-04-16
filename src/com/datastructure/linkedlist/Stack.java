package com.datastructure.linkedlist;

/**
 * Stack is the data structure which works on the principle LIFO (Last in first
 * out)
 * 
 * List of operations that can be performed in stack are 1. Push 2. Pop 3. Peek
 * 
 **/
public class Stack {
	//Initialize the top index to -1 since the stack is empty
	private int top = -1;
	private int[] stack;
	
	public Stack(int stackSize) {
		stack = new int[stackSize];
	}
	
	public void push(int data){
		this.top++;
		stack[top] = data;
		
	}
	
	public int pop(){
		if(top ==-1){
			return 0;
		}
		int data = stack[this.top];
		top--;
		return data;
	}
	
	
	public int peek(){
		return stack[this.top];
	}
	
}