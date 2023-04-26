package Linkedlist;


	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.OutputStreamWriter;
	import java.util.Scanner;
//Reverse link list by recursion
	public class Reverselinkedlist {
		Node head;
		/* Link list node */
		static class Node {
			public int data;
			public Node next;

			public Node(int nodeData) {
				this.data = nodeData;
				this.next = null;
			}
		}

		

			public void insertNode(int nodeData) {
				Node node = new Node(nodeData);

				if (head != null) {
					node.next = head;
				}
				this.head = node;
			}
		

		/* Function to print linked list */
		public static void printSinglyLinkedList(Node node,
							String sep) throws IOException {
			while (node != null) {
				System.out.print(String.valueOf(node.data) + sep);
				node = node.next;
			}
		}

		// Complete the reverse function below.
		static Node reverse(Node head) {
			if(head == null) {   ///boundary condition: if head(current as head) =null
				return head;
			}

			// if head.next=null(current as head)and last node or only one node so make this as head and we will reverse this. 
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

	

		public static void main(String[] args) throws IOException {
			Reverselinkedlist llist = new Reverselinkedlist();
			
				llist.insertNode(20);
				llist.insertNode(4);
			//	llist.insertNode(15);
			//	llist.insertNode(85);
				
				System.out.println("Given linked list:");
				printSinglyLinkedList(llist.head, " ");
				
				System.out.println();
				System.out.println("Reversed Linked list:");
				Node llist1 = reverse(llist.head);
				printSinglyLinkedList(llist1, " ");

		}
	}


