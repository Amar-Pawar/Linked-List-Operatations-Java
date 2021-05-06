package com.LinkedList;

import java.util.List;

public class MyLinkedList {
	

	public static void main(String[] args) {
		
	
		LinkedList linkedList1=new LinkedList();
		linkedList1.push(70);
	    linkedList1.push(30);
		linkedList1.push(56);
		linkedList1.printList();
		
		System.out.println("\n");
		
		//for appending node
		LinkedList linkedList2 = new LinkedList();
		linkedList2.append(70);
	    linkedList2.append(30);
		linkedList2.append(56);
		linkedList2.printList();
		
		System.out.println("\n");
		//for deleting node
		LinkedList linkedList3 = new LinkedList();
		linkedList3.push(70);
		linkedList3.push(30);
		linkedList3.push(56);
		linkedList3.deleteNode(70);
		linkedList3.printList();
		

		System.out.println("\n");
		//for inserting node
		LinkedList linkedList4=new LinkedList();
		linkedList4.push(70);
	    linkedList4.push(30);
		linkedList4.push(56);
		linkedList4.insertAfter(linkedList4.head.next, 80);
		linkedList4.printList();
		
		
		System.out.println("\n");
		//for inserting node
		LinkedList linkedList5=new LinkedList();
		linkedList5.push(70);
	    linkedList5.push(30);
		linkedList5.push(56);
		linkedList5.pop();
		linkedList5.printList();

	}

}



class LinkedList{
	Node head;
	
		class Node {
		
		  int data;
		  Node next;
		
		  Node(int data){
			this.data = data;
			next =  null;
		  }
		}
		

		public void push (int data) {
			Node newNode=new Node(data);
		 	newNode.next=head;
		 	head=newNode;	
		     }
		
		public void insertAfter(Node prevNode, int data) {
			if (prevNode == null) {
				System.out.println("previous node should not be null");
				return;
			}
			Node newNode = new Node(data);
			newNode.next = prevNode.next;
			prevNode.next = newNode;
			
		}
		
		public void pop() {
			if (head == null) {
				System.out.println("underflow");
				return;
			}
			head = (head).next;
		}

		//deleting a node given a key
		 public void deleteNode(int key) {
			 Node temp = head, prev = null;
			 //if head node itself is a key to be deleted
			 if (temp != null && temp.data == key) {
				 head = temp.next;
				 return;
			 }
			// using while loop to search for a key to be deleted
			 while (temp != null &&temp.data != key) {
				 prev = temp;
				 temp = temp.next;
			 }
			 //if key is not present return
			 if (temp == null)
				 return;
			// for unlinking a node
			 prev.next = temp.next;
				 
		}



		public void append(int data) {
		    Node newNode = new Node(data);
		    if(head == null) {
			head= newNode;
			return;
		    }
		    
		    Node last= head;
		    while(last.next != null) {
			last = last.next;
		    }
		    last.next=newNode;
 }

			public void printList() {
				System.out.print("LinkedList:");
			 	Node temp=head;
			 	
			 	while(temp != null) {
			 		System.out.print(temp.data+" -> ");
			 		temp = temp.next;
			 	     }
			     }
		}

		