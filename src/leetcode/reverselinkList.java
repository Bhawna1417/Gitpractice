package leetcode;

 // Java program for reversing the linked list
	 
	class reverselinklist 
	{
		
		
		private ListNode head;
				
		private static class ListNode
		{
			private  int data;
			private ListNode next;
			 
			public ListNode(int data)
			{
				this.data=data;
				this.next=null;
			}
			
		}
		
	public void display() 
	{
		ListNode current=head;
		while (current!=null)
		{
			current=current.next;
			System.out.println(current.data);
		}
				
	}
	public static void main(String arg[])
	{
		reverselinklist rl=new reverselinklist();
		rl.head=new ListNode(10);
		ListNode second=new ListNode(1);
		ListNode third=new ListNode(8);
		ListNode fourth=new ListNode(11);
		
		
		//now we will connect them together to form a chain
		rl.head.next=second;//10->1
		second.next=third; //10->1->8
		third.next=fourth; //10->1->8->11
		
	}
	
	}
	
	    