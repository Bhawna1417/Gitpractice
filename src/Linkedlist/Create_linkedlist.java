package Linkedlist;



	import java.io.*;

	// Java program to implement
	// a Singly Linked List
	public class Create_linkedlist {

		static Node head; // head of list

		// Linked list Node.
		// This inner class is made static
		// so that main() can access it
		static class Node {

			int data;
			Node next;

			// Constructor
			Node(int d)
			{
				this.data = d;
				this.next = null;
			}
		}

		// Method to insert a new node
		public static Create_linkedlist insertlast(Create_linkedlist list, int data)
		{
			// Create a new node with given data
			Node new_node = new Node(data);
			new_node.next = null;

			// If the Linked List is empty,
			// then make the new node as head
			if (list.head == null) {
				list.head = new_node;
			}
			else {
				// Else traverse till the last node
				// and insert the new_node there
				Node last = list.head;
				while (last.next != null) {
					last = last.next;
				}

				// Insert the new_node at last node
				last.next = new_node;
			}

			// Return the list by head
			return list;
		}
 
		//Reverse
		
		static Node reverse(Node head) {
	        if(head == null) {
	            return head;
	        }
	  
	        // last node or only one node
	        if(head.next == null) {
	            return head;
	        }
	  
	        Node newHeadNode = reverse(head.next);
	  
	        // change references for middle chain
	        head.next.next = head;
	        head.next = null;
	  
	        // send back new head node in every recursion
	        return newHeadNode;
	    }
		
			
		
		// Method to print the LinkedList.
		public static void printList(Create_linkedlist list)
		{
			Node currNode = list.head;
		
			System.out.print("LinkedList: ");
		
			// Traverse through the LinkedList
			while (currNode != null) {
				// Print the data at current node
				System.out.print(currNode.data + " ");
		
				// Go to next node
				currNode = currNode.next;
			}
		}
		
		// Driver code
		public static void main(String[] args)
		{
			/* Start with the empty list. */
			Create_linkedlist list = new Create_linkedlist();


			// Insert the values
			insertlast(list, 1);
			list.insertlast(list, 2);
//			list = insertlast(list, 3);
//			list = insertlast(list, 4);
//			list = insertlast(list, 5);
//			list = insertlast(list, 6);
//			list = insertlast(list, 7);
//			list = insertlast(list, 8);

			// Print the LinkedList
			printList(list);
		}
	}
