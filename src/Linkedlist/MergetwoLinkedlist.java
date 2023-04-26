package Linkedlist;

import java.util.LinkedList;

import Linkedlist.Linkedlist.Node;

public class MergetwoLinkedlist {
	static Node head;
	static class Node
	{
		int data;
		Node next;
		
	Node(int data)
	{
	this.data=data;	
	}
	}
	
	 public static Node insertnode(int data)
	   {
		  Node n=new Node(data);
		  n.data=data;
		  n.next=null;
		  return n;
		   
		  
	   }

		/*
		 * public Node mergeLinkedlist(Node n1,Node n2) { if(n1==null ) return n1; if(
		 * n2==null) return n2;
		 * 
		 * Node dummy=new Node(-1); Node prev=dummy;
		 * 
		 * while(n1!=null && n2!=null) { if(n1.data <n2.data) {
		 * n1.next=mergeLinkedlist(n1.next,n2); return n1;
		 * 
		 * } else { n2.next=mergeLinkedlist(n1.next,n2); return n2;
		 */
			//prev.next=n2;
		   //n2=n2.next;
		}
	
	}
	//prev.next=n1!=null ? n1:n2;
	}

 public void print(Node node)
 {
	 while(node!=null)
	 {
		 System.out.println(node.data);
		 node=node.next;
 }
 
 }
	

	public static void main(String[] args) 
	{
		Node head1 = insertnode(1);
        head1.next = insertnode(3);
        head1.next.next = insertnode(5);
 
        // 1.3.5 LinkedList created
 
        Node head2 = insertnode(0);
        head2.next =insertnode(2);
        head2.next.next = insertnode(4);
 
        // 0.2.4 LinkedList created
 
        Node mergedhead = merge(head1, head2);
 
        printList(mergedhead);
    }
}
		

	}

}
