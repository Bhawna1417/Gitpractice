package Linkedlist;

import Linkedlist.Linkedlist.Node;

public class RotateLinkedlist {

 
	
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
			   public void insertnode(int data)
			   {
				  Node n=new Node(data);
				   //n.data=data;
				//   n.next=null;
				   
				   if (head==null)
				   {
					   head=new Node(data);;
					   return;
				   }
				   n.next=null;
				   
				  // else
				  //{  
					   Node node=head;
				    while(node.next!=null)
				    {
					  node=node.next;
				   }
				  node.next=n;
				  return;
			   }
			   

public int sizeoflink()
{
	int count=0;
	Node n=head;
	while(n!=null)
	{
		n=n.next;
		count++;
	}
	//System.out.println("size" +count);
	return count;
}

public void search_node(int key)
{
	Node node=head;
	while(node!=null)
	{
		if (node.data==key)
		{
			System.out.println( node.data+ " node found");
		}
		
			node=node.next;
			
		
	}
}
public Node rotateClockwise(Node node,int k) {
	 node = head;
    if(node == null || k < 0) {
      return node;
    }
    
    int sizeOfLinkedList = sizeoflink();
    k = k % sizeOfLinkedList;
    
    if(k == 0) {
      return node;
    }
    
    Node tmp = node;
    int i = 1;
    
    while(i < sizeOfLinkedList - k) {
      tmp = tmp.next;
      i++;
    }
    
    Node temp = tmp.next;
    Node head = temp;
    tmp.next = null;
    i=1;
    while(temp.next != null) {
      temp = temp.next;
    }
    
    temp.next = node;
    
    System.out.println("rotate");
    return head;
  }

//GFG

static Node rightRotate(Node head, int k)
{
 
    // If the linked list is empty
    if (head == null)
        return head;
 
    // len is used to store length of the linked list
    // tmp will point to the last node after this loop
    Node tmp = head;
    int len = 1;
    while (tmp.next != null)
    {
        tmp = tmp.next;
        len++;
    }
 
    // If k is greater than the size
    // of the linked list
    if (k > len)
        k = k % len;
 
    // Subtract from length to convert
    // it into left rotation
    k = len - k;
 
    // If no rotation needed then
    // return the head node   
    if (k == 0 || k == len)
        return head;
 
    // current will either point to
    // kth or null after this loop
    Node current = head;
    int cnt = 1;
    while (cnt < k && current != null)
    {
        current = current.next;
        cnt++;
    }
 
    // If current is null then k is equal to the
    // count of nodes in the list
    // Don't change the list in this case
    if (current == null)
        return head;
 
    // current points to the kth node
    Node kthnode = current;
 
    // Change next of last node to previous head
    tmp.next = head;
 
    // Change head to (k+1)th node
    head = kthnode.next;
 
    // Change next of kth node to null
    kthnode.next = null;
 
    // Return the updated head pointer
    return head;
}
 
// Driver code

  		    public void show(Node node)
				   {
					   node=head;
					   while(node!=null)
					   {
						System.out.print(node.data +" ---> ");
						node=node.next;
						
					   }
					   
					 System.out.println("null");
				   }
			    
	public static void main(String[] args) {
		RotateLinkedlist list=new RotateLinkedlist();
		//insert at end
		Node head = null;
			list.insertnode(10);
			list.insertnode(20);
			list.insertnode(30);
			list.insertnode(40);
            //list.rotate(1);
			list.show(head);
			//Node node = head;
			list.sizeoflink();
			//list.search_node(30);
			Node updated_head=	list.rightRotate(head,3);
			list.show(updated_head);
			Node updated_head1=	list.rotateClockwise(head,2);
			list.show(updated_head1);
		// TODO Auto-generated method stub

	}

}
