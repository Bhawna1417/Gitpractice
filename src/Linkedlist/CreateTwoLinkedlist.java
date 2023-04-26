package Linkedlist;

import Linkedlist.Linkedlist.Node;

public class CreateTwoLinkedlist {
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
	   
	   //insert node at the end
	   public void addToTheLast(Node node)
	   {
	       if (head == null)
	       {
	           head = node;
	       }
	       else
	       {
	           Node temp = head;
	           while (temp.next != null)
	               temp = temp.next;
	           temp.next = node;
	       }
	   }
		  public void show()
		   {
			   Node node=head;
			   while(node!=null)
			   {
				System.out.print(node.data +" ---> ");
				node=node.next;
				
			   }
			   
			 System.out.println("null");
		   }
		   public static void main(String[] args) 
			{		CreateTwoLinkedlist list=new CreateTwoLinkedlist();
			//insert at end
				list.addToTheLast(new Node(5));
				list.addToTheLast(new Node(10));


				list.show();
				CreateTwoLinkedlist list1=new CreateTwoLinkedlist();
				//insert at end
					list1.addToTheLast(new Node(15));
					list1.addToTheLast(new Node(20));


					list.show();
			}

}
