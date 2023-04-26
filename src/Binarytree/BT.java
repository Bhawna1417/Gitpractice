package Binarytree;

public class BT {
	
	 Node root;
	
	 class Node
	{
		int data;
		Node left;
		Node right;
	
	
	public Node (int data1)
	{
		this.data=data1;
	}
	
	}
	 
	 public void createBT()
	 {
		 Node top=new Node(1);
		 Node first=new Node(2);
		 Node Second=new Node(3);
		 Node third=new Node(4);
		 Node fourth=new Node(5);
		 root=top;
		 top.left=first;
		 top.right=Second;
		 first.left=third;
		 first.right=fourth;
		 
	
	 }
	 
	 public void preorder(Node root)
	 {
		 if (root==null)
		 {
			 return;
		 }
		 System.out.print(" " +root.data+ " ");
		 preorder(root.left);
		 preorder(root.right);
	 }
	 
	 public void postorder(Node root)
	 {
		 if(root==null)
			 return;
		 postorder(root.left);
		 postorder(root.right);
		 System.out.print(root.data+ " ");
	 }
	 
	 public void inorder(Node root)
	 {
		 if(root==null)
			 return;
		 inorder(root.left);
		 System.out.print(root.data+ " ");
		 inorder(root.right);
		
	 }
	 
	 //Find max value in the BT 
	 public int findmax(Node root)
	 {
		 if (root==null)
		 {
			 return -1;
		 }
		 int result=root.data;
		int left= findmax(root.left);
		 int right =findmax(root.right);
		 if (left>result)
		 {
			 return left;
		 }
		 if(right>result)
		 {
			 return  right;
		 }
		return result; 
	 }
	 
	 public int findmaxx()
	 {
		return findmax(root); 
	 }
	 
	public static void main(String[] args) {
		BT bt =new BT();
		bt.createBT();
		System.out.println("Pre order Traversal: ");
		bt.preorder(bt.root);
		System.out.println("Post order Traversal: ");
		bt.postorder(bt.root);
		System.out.println("In order Traversal: ");
		bt.inorder(bt.root);
		
		
		//int result1=bt.findmax(bt.root);
		System.out.println("largest "+bt.findmaxx());
		
		// TODO Auto-generated method stub

	}

}
