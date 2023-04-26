package Linkedlist;

public class Linkedlist {
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
	   
	   //Insert node at the begining
	   public void insertBegining(int data)
	   {
		   Node newnode=new Node(data);
		   newnode.next=head;
		   head=newnode;
		   
	   }
	   
	   public void insertAtgivenPos(int position,int data)
	   {
		   Node node=new Node(data);
		   if(position==1)
		   {
			   node.next=head;
			   head=node;
		   }
		   else
		   {
			   Node prenode=head;
			   int count=1;
			   while(count<position-1)
			   {
				   prenode=prenode.next;
				   count++;
			   }
			   Node newnode=prenode.next;
			   prenode.next=node;
			   node.next=newnode;
			   
		   }
	   }
	   
	   public Node deletefrombegin()
	   {
		   if(head==null)
		   {
			   return head;
		   }
		   Node temp=head;
		   head=head.next;
		   temp.next=null;
		return temp;
		   
	   }
	   public Node deletefromLast()
	   { 
		   if(head==null || head.next==null)
		   {
			   return head;
		   }
		   Node current=head;
		   Node prev=null;
		   while(current.next!=null)
		   {
			   prev=current;
			   current=current.next;
		   }
		   prev.next=null;
		   return current;
		   
	   }
	   
	   //Search an element
	   public boolean search(int key)
	   {
		   if (head==null)
		   {
			   return false;
		   }
		   Node node=head;
		  while(node!=null)
		  {
			  if(node.data==key)
			  {
				  return true;
		  }
			  node=node.next;
		  }
				  return false;
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
   ///find the length of list
	   
	   public int length()
	   {
		   if (head==null)
		   {
			   return 0;
		   }
		   int count=0;
		   Node current=head;
		   while (current!=null)
		   {
			  count++;
			  current=current.next;
		   }
		   return count;
	   }
	
	public static void main(String[] args) 
	{		Linkedlist list=new Linkedlist();
	//insert at end
		list.insertnode(10);
		list.insertnode(20);


		list.show();
		System.out.println("Length of linkedlist " +list.length());
		//insert at beginning
		list.insertBegining(60);
		list.show();
		System.out.println("After add element in beginning ,Length of linkedlist " +list.length());
		list.insertAtgivenPos(3,45);
		list.show();
		System.out.println("add element in given pos of linkedlist ");
		list.deletefrombegin();
		list.show();
		System.out.println("Delete element from begining of linkedlist ");
		list.deletefromLast();
		list.show();
		System.out.println("Delete element from last of linkedlist ");
		if(list.search(20))
		{
			
			System.out.println("Searched element found");
	}
		else {
			System.out.println("Searched element not found");
		}
		// TODO Auto-generated method stub
	}
	
	}




