package Stack;



public class stackLinkedlist {
     static Node head;
	class Node
	{
		Node next;
		int data;
	//	public int value;
	
	Node (int data)
	{
		this.data=data;
	}
	}
	public static Node getnewnode(int val)
	{
		Node  node=new Node(val);
		node.data=val;
		node.next=null;
		return node;
	}
	
	public static void push(int value)
	{
		   {
			   if(head==null)
			   {
				   head=getnewnode(value);
				   return;
			   }
		    
		           Node temp = getnewnode(value);
		         temp.next=head;
		         //head.value=value;
		         head=temp;
		        
		       }
		   
	}
	
	public int pop()
	{
		if(head==null)
		{
			System.out.println("stack is empty");
			
		}
	
			   int temp=head.val;
		   head=head.next;
		   //temp.next=null;
		return temp;
		   
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

	}

}
}